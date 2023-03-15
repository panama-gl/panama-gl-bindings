// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IPrintDialogServicesVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCurrentDevMode"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCurrentPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCurrentPortName")
    ).withName("IPrintDialogServicesVtbl");
    public static MemoryLayout $LAYOUT() {
        return IPrintDialogServicesVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IPrintDialogServicesVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IPrintDialogServicesVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPrintDialogServicesVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IPrintDialogServicesVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogServicesVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogServicesVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IPrintDialogServicesVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IPrintDialogServicesVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPrintDialogServicesVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IPrintDialogServicesVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogServicesVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogServicesVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IPrintDialogServicesVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IPrintDialogServicesVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPrintDialogServicesVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IPrintDialogServicesVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogServicesVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogServicesVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetCurrentDevMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentDevMode$MH = RuntimeHelper.downcallHandle(
        IPrintDialogServicesVtbl.GetCurrentDevMode$FUNC
    );
    public interface GetCurrentDevMode {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetCurrentDevMode fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetCurrentDevMode.class, fi, IPrintDialogServicesVtbl.GetCurrentDevMode$FUNC, session);
        }
        static GetCurrentDevMode ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPrintDialogServicesVtbl.GetCurrentDevMode$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentDevMode"));
    public static VarHandle GetCurrentDevMode$VH() {
        return IPrintDialogServicesVtbl.GetCurrentDevMode$VH;
    }
    public static MemoryAddress GetCurrentDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.GetCurrentDevMode$VH.get(seg);
    }
    public static void GetCurrentDevMode$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogServicesVtbl.GetCurrentDevMode$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.GetCurrentDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogServicesVtbl.GetCurrentDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentDevMode GetCurrentDevMode (MemorySegment segment, MemorySession session) {
        return GetCurrentDevMode.ofAddress(GetCurrentDevMode$get(segment), session);
    }
    static final FunctionDescriptor GetCurrentPrinterName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentPrinterName$MH = RuntimeHelper.downcallHandle(
        IPrintDialogServicesVtbl.GetCurrentPrinterName$FUNC
    );
    public interface GetCurrentPrinterName {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetCurrentPrinterName fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetCurrentPrinterName.class, fi, IPrintDialogServicesVtbl.GetCurrentPrinterName$FUNC, session);
        }
        static GetCurrentPrinterName ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPrintDialogServicesVtbl.GetCurrentPrinterName$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentPrinterName"));
    public static VarHandle GetCurrentPrinterName$VH() {
        return IPrintDialogServicesVtbl.GetCurrentPrinterName$VH;
    }
    public static MemoryAddress GetCurrentPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.GetCurrentPrinterName$VH.get(seg);
    }
    public static void GetCurrentPrinterName$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogServicesVtbl.GetCurrentPrinterName$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.GetCurrentPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentPrinterName$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogServicesVtbl.GetCurrentPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentPrinterName GetCurrentPrinterName (MemorySegment segment, MemorySession session) {
        return GetCurrentPrinterName.ofAddress(GetCurrentPrinterName$get(segment), session);
    }
    static final FunctionDescriptor GetCurrentPortName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentPortName$MH = RuntimeHelper.downcallHandle(
        IPrintDialogServicesVtbl.GetCurrentPortName$FUNC
    );
    public interface GetCurrentPortName {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetCurrentPortName fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetCurrentPortName.class, fi, IPrintDialogServicesVtbl.GetCurrentPortName$FUNC, session);
        }
        static GetCurrentPortName ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPrintDialogServicesVtbl.GetCurrentPortName$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentPortName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentPortName"));
    public static VarHandle GetCurrentPortName$VH() {
        return IPrintDialogServicesVtbl.GetCurrentPortName$VH;
    }
    public static MemoryAddress GetCurrentPortName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.GetCurrentPortName$VH.get(seg);
    }
    public static void GetCurrentPortName$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogServicesVtbl.GetCurrentPortName$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentPortName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogServicesVtbl.GetCurrentPortName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentPortName$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogServicesVtbl.GetCurrentPortName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentPortName GetCurrentPortName (MemorySegment segment, MemorySession session) {
        return GetCurrentPortName.ofAddress(GetCurrentPortName$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


