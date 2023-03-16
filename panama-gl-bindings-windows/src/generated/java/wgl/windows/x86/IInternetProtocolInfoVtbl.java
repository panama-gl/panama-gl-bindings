// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IInternetProtocolInfoVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("ParseUrl"),
        Constants$root.C_POINTER$LAYOUT.withName("CombineUrl"),
        Constants$root.C_POINTER$LAYOUT.withName("CompareUrl"),
        Constants$root.C_POINTER$LAYOUT.withName("QueryInfo")
    ).withName("IInternetProtocolInfoVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetProtocolInfoVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolInfoVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetProtocolInfoVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInternetProtocolInfoVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetProtocolInfoVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolInfoVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolInfoVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolInfoVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetProtocolInfoVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolInfoVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetProtocolInfoVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolInfoVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolInfoVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolInfoVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetProtocolInfoVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolInfoVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetProtocolInfoVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolInfoVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolInfoVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor ParseUrl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ParseUrl$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolInfoVtbl.ParseUrl$FUNC
    );
    public interface ParseUrl {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, int _x3, java.lang.foreign.MemoryAddress _x4, int _x5, java.lang.foreign.MemoryAddress _x6, int _x7);
        static MemorySegment allocate(ParseUrl fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ParseUrl.class, fi, IInternetProtocolInfoVtbl.ParseUrl$FUNC, session);
        }
        static ParseUrl ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, int __x3, java.lang.foreign.MemoryAddress __x4, int __x5, java.lang.foreign.MemoryAddress __x6, int __x7) -> {
                try {
                    return (int)IInternetProtocolInfoVtbl.ParseUrl$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, (java.lang.foreign.Addressable)__x4, __x5, (java.lang.foreign.Addressable)__x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ParseUrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParseUrl"));
    public static VarHandle ParseUrl$VH() {
        return IInternetProtocolInfoVtbl.ParseUrl$VH;
    }
    public static MemoryAddress ParseUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.ParseUrl$VH.get(seg);
    }
    public static void ParseUrl$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolInfoVtbl.ParseUrl$VH.set(seg, x);
    }
    public static MemoryAddress ParseUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.ParseUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParseUrl$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolInfoVtbl.ParseUrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ParseUrl ParseUrl (MemorySegment segment, MemorySession session) {
        return ParseUrl.ofAddress(ParseUrl$get(segment), session);
    }
    static final FunctionDescriptor CombineUrl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CombineUrl$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolInfoVtbl.CombineUrl$FUNC
    );
    public interface CombineUrl {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3, java.lang.foreign.MemoryAddress _x4, int _x5, java.lang.foreign.MemoryAddress _x6, int _x7);
        static MemorySegment allocate(CombineUrl fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CombineUrl.class, fi, IInternetProtocolInfoVtbl.CombineUrl$FUNC, session);
        }
        static CombineUrl ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3, java.lang.foreign.MemoryAddress __x4, int __x5, java.lang.foreign.MemoryAddress __x6, int __x7) -> {
                try {
                    return (int)IInternetProtocolInfoVtbl.CombineUrl$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3, (java.lang.foreign.Addressable)__x4, __x5, (java.lang.foreign.Addressable)__x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CombineUrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CombineUrl"));
    public static VarHandle CombineUrl$VH() {
        return IInternetProtocolInfoVtbl.CombineUrl$VH;
    }
    public static MemoryAddress CombineUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.CombineUrl$VH.get(seg);
    }
    public static void CombineUrl$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolInfoVtbl.CombineUrl$VH.set(seg, x);
    }
    public static MemoryAddress CombineUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.CombineUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CombineUrl$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolInfoVtbl.CombineUrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CombineUrl CombineUrl (MemorySegment segment, MemorySession session) {
        return CombineUrl.ofAddress(CombineUrl$get(segment), session);
    }
    static final FunctionDescriptor CompareUrl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompareUrl$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolInfoVtbl.CompareUrl$FUNC
    );
    public interface CompareUrl {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(CompareUrl fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CompareUrl.class, fi, IInternetProtocolInfoVtbl.CompareUrl$FUNC, session);
        }
        static CompareUrl ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    return (int)IInternetProtocolInfoVtbl.CompareUrl$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CompareUrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CompareUrl"));
    public static VarHandle CompareUrl$VH() {
        return IInternetProtocolInfoVtbl.CompareUrl$VH;
    }
    public static MemoryAddress CompareUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.CompareUrl$VH.get(seg);
    }
    public static void CompareUrl$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolInfoVtbl.CompareUrl$VH.set(seg, x);
    }
    public static MemoryAddress CompareUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.CompareUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CompareUrl$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolInfoVtbl.CompareUrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CompareUrl CompareUrl (MemorySegment segment, MemorySession session) {
        return CompareUrl.ofAddress(CompareUrl$get(segment), session);
    }
    static final FunctionDescriptor QueryInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle QueryInfo$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolInfoVtbl.QueryInfo$FUNC
    );
    public interface QueryInfo {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, int _x3, java.lang.foreign.MemoryAddress _x4, int _x5, java.lang.foreign.MemoryAddress _x6, int _x7);
        static MemorySegment allocate(QueryInfo fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInfo.class, fi, IInternetProtocolInfoVtbl.QueryInfo$FUNC, session);
        }
        static QueryInfo ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, int __x3, java.lang.foreign.MemoryAddress __x4, int __x5, java.lang.foreign.MemoryAddress __x6, int __x7) -> {
                try {
                    return (int)IInternetProtocolInfoVtbl.QueryInfo$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, (java.lang.foreign.Addressable)__x4, __x5, (java.lang.foreign.Addressable)__x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInfo"));
    public static VarHandle QueryInfo$VH() {
        return IInternetProtocolInfoVtbl.QueryInfo$VH;
    }
    public static MemoryAddress QueryInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.QueryInfo$VH.get(seg);
    }
    public static void QueryInfo$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolInfoVtbl.QueryInfo$VH.set(seg, x);
    }
    public static MemoryAddress QueryInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolInfoVtbl.QueryInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolInfoVtbl.QueryInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInfo QueryInfo (MemorySegment segment, MemorySession session) {
        return QueryInfo.ofAddress(QueryInfo$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


