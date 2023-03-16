// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IRunnableObjectVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetRunningClass"),
        Constants$root.C_POINTER$LAYOUT.withName("Run"),
        Constants$root.C_POINTER$LAYOUT.withName("IsRunning"),
        Constants$root.C_POINTER$LAYOUT.withName("LockRunning"),
        Constants$root.C_POINTER$LAYOUT.withName("SetContainedObject")
    ).withName("IRunnableObjectVtbl");
    public static MemoryLayout $LAYOUT() {
        return IRunnableObjectVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IRunnableObjectVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IRunnableObjectVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IRunnableObjectVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IRunnableObjectVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IRunnableObjectVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IRunnableObjectVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IRunnableObjectVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IRunnableObjectVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IRunnableObjectVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IRunnableObjectVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IRunnableObjectVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IRunnableObjectVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetRunningClass$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetRunningClass$MH = RuntimeHelper.downcallHandle(
        IRunnableObjectVtbl.GetRunningClass$FUNC
    );
    public interface GetRunningClass {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetRunningClass fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetRunningClass.class, fi, IRunnableObjectVtbl.GetRunningClass$FUNC, session);
        }
        static GetRunningClass ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IRunnableObjectVtbl.GetRunningClass$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetRunningClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetRunningClass"));
    public static VarHandle GetRunningClass$VH() {
        return IRunnableObjectVtbl.GetRunningClass$VH;
    }
    public static MemoryAddress GetRunningClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.GetRunningClass$VH.get(seg);
    }
    public static void GetRunningClass$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.GetRunningClass$VH.set(seg, x);
    }
    public static MemoryAddress GetRunningClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.GetRunningClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetRunningClass$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.GetRunningClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetRunningClass GetRunningClass (MemorySegment segment, MemorySession session) {
        return GetRunningClass.ofAddress(GetRunningClass$get(segment), session);
    }
    static final FunctionDescriptor Run$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Run$MH = RuntimeHelper.downcallHandle(
        IRunnableObjectVtbl.Run$FUNC
    );
    public interface Run {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(Run fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Run.class, fi, IRunnableObjectVtbl.Run$FUNC, session);
        }
        static Run ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IRunnableObjectVtbl.Run$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Run$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Run"));
    public static VarHandle Run$VH() {
        return IRunnableObjectVtbl.Run$VH;
    }
    public static MemoryAddress Run$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.Run$VH.get(seg);
    }
    public static void Run$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.Run$VH.set(seg, x);
    }
    public static MemoryAddress Run$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.Run$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Run$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.Run$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Run Run (MemorySegment segment, MemorySession session) {
        return Run.ofAddress(Run$get(segment), session);
    }
    static final FunctionDescriptor IsRunning$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsRunning$MH = RuntimeHelper.downcallHandle(
        IRunnableObjectVtbl.IsRunning$FUNC
    );
    public interface IsRunning {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(IsRunning fi, MemorySession session) {
            return RuntimeHelper.upcallStub(IsRunning.class, fi, IRunnableObjectVtbl.IsRunning$FUNC, session);
        }
        static IsRunning ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IRunnableObjectVtbl.IsRunning$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsRunning$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsRunning"));
    public static VarHandle IsRunning$VH() {
        return IRunnableObjectVtbl.IsRunning$VH;
    }
    public static MemoryAddress IsRunning$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.IsRunning$VH.get(seg);
    }
    public static void IsRunning$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.IsRunning$VH.set(seg, x);
    }
    public static MemoryAddress IsRunning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.IsRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsRunning$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.IsRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsRunning IsRunning (MemorySegment segment, MemorySession session) {
        return IsRunning.ofAddress(IsRunning$get(segment), session);
    }
    static final FunctionDescriptor LockRunning$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LockRunning$MH = RuntimeHelper.downcallHandle(
        IRunnableObjectVtbl.LockRunning$FUNC
    );
    public interface LockRunning {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2);
        static MemorySegment allocate(LockRunning fi, MemorySession session) {
            return RuntimeHelper.upcallStub(LockRunning.class, fi, IRunnableObjectVtbl.LockRunning$FUNC, session);
        }
        static LockRunning ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2) -> {
                try {
                    return (int)IRunnableObjectVtbl.LockRunning$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle LockRunning$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LockRunning"));
    public static VarHandle LockRunning$VH() {
        return IRunnableObjectVtbl.LockRunning$VH;
    }
    public static MemoryAddress LockRunning$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.LockRunning$VH.get(seg);
    }
    public static void LockRunning$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.LockRunning$VH.set(seg, x);
    }
    public static MemoryAddress LockRunning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.LockRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockRunning$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.LockRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LockRunning LockRunning (MemorySegment segment, MemorySession session) {
        return LockRunning.ofAddress(LockRunning$get(segment), session);
    }
    static final FunctionDescriptor SetContainedObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetContainedObject$MH = RuntimeHelper.downcallHandle(
        IRunnableObjectVtbl.SetContainedObject$FUNC
    );
    public interface SetContainedObject {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(SetContainedObject fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetContainedObject.class, fi, IRunnableObjectVtbl.SetContainedObject$FUNC, session);
        }
        static SetContainedObject ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IRunnableObjectVtbl.SetContainedObject$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetContainedObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetContainedObject"));
    public static VarHandle SetContainedObject$VH() {
        return IRunnableObjectVtbl.SetContainedObject$VH;
    }
    public static MemoryAddress SetContainedObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.SetContainedObject$VH.get(seg);
    }
    public static void SetContainedObject$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.SetContainedObject$VH.set(seg, x);
    }
    public static MemoryAddress SetContainedObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRunnableObjectVtbl.SetContainedObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetContainedObject$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.SetContainedObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetContainedObject SetContainedObject (MemorySegment segment, MemorySession session) {
        return SetContainedObject.ofAddress(SetContainedObject$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


