// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ICancelMethodCallsVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Cancel"),
        Constants$root.C_POINTER$LAYOUT.withName("TestCancel")
    ).withName("ICancelMethodCallsVtbl");
    public static MemoryLayout $LAYOUT() {
        return ICancelMethodCallsVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ICancelMethodCallsVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return ICancelMethodCallsVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        ICancelMethodCallsVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        ICancelMethodCallsVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ICancelMethodCallsVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return ICancelMethodCallsVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        ICancelMethodCallsVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        ICancelMethodCallsVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, ICancelMethodCallsVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return ICancelMethodCallsVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        ICancelMethodCallsVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        ICancelMethodCallsVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Cancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Cancel$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.Cancel$FUNC
    );
    public interface Cancel {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(Cancel fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Cancel.class, fi, ICancelMethodCallsVtbl.Cancel$FUNC, session);
        }
        static Cancel ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.Cancel$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Cancel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Cancel"));
    public static VarHandle Cancel$VH() {
        return ICancelMethodCallsVtbl.Cancel$VH;
    }
    public static MemoryAddress Cancel$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.Cancel$VH.get(seg);
    }
    public static void Cancel$set( MemorySegment seg, MemoryAddress x) {
        ICancelMethodCallsVtbl.Cancel$VH.set(seg, x);
    }
    public static MemoryAddress Cancel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.Cancel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Cancel$set(MemorySegment seg, long index, MemoryAddress x) {
        ICancelMethodCallsVtbl.Cancel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Cancel Cancel (MemorySegment segment, MemorySession session) {
        return Cancel.ofAddress(Cancel$get(segment), session);
    }
    static final FunctionDescriptor TestCancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TestCancel$MH = RuntimeHelper.downcallHandle(
        ICancelMethodCallsVtbl.TestCancel$FUNC
    );
    public interface TestCancel {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(TestCancel fi, MemorySession session) {
            return RuntimeHelper.upcallStub(TestCancel.class, fi, ICancelMethodCallsVtbl.TestCancel$FUNC, session);
        }
        static TestCancel ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ICancelMethodCallsVtbl.TestCancel$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle TestCancel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TestCancel"));
    public static VarHandle TestCancel$VH() {
        return ICancelMethodCallsVtbl.TestCancel$VH;
    }
    public static MemoryAddress TestCancel$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.TestCancel$VH.get(seg);
    }
    public static void TestCancel$set( MemorySegment seg, MemoryAddress x) {
        ICancelMethodCallsVtbl.TestCancel$VH.set(seg, x);
    }
    public static MemoryAddress TestCancel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICancelMethodCallsVtbl.TestCancel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TestCancel$set(MemorySegment seg, long index, MemoryAddress x) {
        ICancelMethodCallsVtbl.TestCancel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static TestCancel TestCancel (MemorySegment segment, MemorySession session) {
        return TestCancel.ofAddress(TestCancel$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


