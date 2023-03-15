// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IOleInPlaceUIWindowVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetWindow"),
        Constants$root.C_POINTER$LAYOUT.withName("ContextSensitiveHelp"),
        Constants$root.C_POINTER$LAYOUT.withName("GetBorder"),
        Constants$root.C_POINTER$LAYOUT.withName("RequestBorderSpace"),
        Constants$root.C_POINTER$LAYOUT.withName("SetBorderSpace"),
        Constants$root.C_POINTER$LAYOUT.withName("SetActiveObject")
    ).withName("IOleInPlaceUIWindowVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleInPlaceUIWindowVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleInPlaceUIWindowVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IOleInPlaceUIWindowVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleInPlaceUIWindowVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IOleInPlaceUIWindowVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleInPlaceUIWindowVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IOleInPlaceUIWindowVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindow$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.GetWindow$FUNC
    );
    public interface GetWindow {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetWindow fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetWindow.class, fi, IOleInPlaceUIWindowVtbl.GetWindow$FUNC, session);
        }
        static GetWindow ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.GetWindow$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetWindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetWindow"));
    public static VarHandle GetWindow$VH() {
        return IOleInPlaceUIWindowVtbl.GetWindow$VH;
    }
    public static MemoryAddress GetWindow$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.GetWindow$VH.get(seg);
    }
    public static void GetWindow$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.GetWindow$VH.set(seg, x);
    }
    public static MemoryAddress GetWindow$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.GetWindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindow$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.GetWindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetWindow GetWindow (MemorySegment segment, MemorySession session) {
        return GetWindow.ofAddress(GetWindow$get(segment), session);
    }
    static final FunctionDescriptor ContextSensitiveHelp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ContextSensitiveHelp$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$FUNC
    );
    public interface ContextSensitiveHelp {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(ContextSensitiveHelp fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ContextSensitiveHelp.class, fi, IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$FUNC, session);
        }
        static ContextSensitiveHelp ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ContextSensitiveHelp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContextSensitiveHelp"));
    public static VarHandle ContextSensitiveHelp$VH() {
        return IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH;
    }
    public static MemoryAddress ContextSensitiveHelp$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH.get(seg);
    }
    public static void ContextSensitiveHelp$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH.set(seg, x);
    }
    public static MemoryAddress ContextSensitiveHelp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextSensitiveHelp$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ContextSensitiveHelp ContextSensitiveHelp (MemorySegment segment, MemorySession session) {
        return ContextSensitiveHelp.ofAddress(ContextSensitiveHelp$get(segment), session);
    }
    static final FunctionDescriptor GetBorder$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBorder$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.GetBorder$FUNC
    );
    public interface GetBorder {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetBorder fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetBorder.class, fi, IOleInPlaceUIWindowVtbl.GetBorder$FUNC, session);
        }
        static GetBorder ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.GetBorder$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBorder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetBorder"));
    public static VarHandle GetBorder$VH() {
        return IOleInPlaceUIWindowVtbl.GetBorder$VH;
    }
    public static MemoryAddress GetBorder$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.GetBorder$VH.get(seg);
    }
    public static void GetBorder$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.GetBorder$VH.set(seg, x);
    }
    public static MemoryAddress GetBorder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.GetBorder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBorder$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.GetBorder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBorder GetBorder (MemorySegment segment, MemorySession session) {
        return GetBorder.ofAddress(GetBorder$get(segment), session);
    }
    static final FunctionDescriptor RequestBorderSpace$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RequestBorderSpace$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.RequestBorderSpace$FUNC
    );
    public interface RequestBorderSpace {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(RequestBorderSpace fi, MemorySession session) {
            return RuntimeHelper.upcallStub(RequestBorderSpace.class, fi, IOleInPlaceUIWindowVtbl.RequestBorderSpace$FUNC, session);
        }
        static RequestBorderSpace ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.RequestBorderSpace$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RequestBorderSpace$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RequestBorderSpace"));
    public static VarHandle RequestBorderSpace$VH() {
        return IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH;
    }
    public static MemoryAddress RequestBorderSpace$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH.get(seg);
    }
    public static void RequestBorderSpace$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH.set(seg, x);
    }
    public static MemoryAddress RequestBorderSpace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestBorderSpace$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RequestBorderSpace RequestBorderSpace (MemorySegment segment, MemorySession session) {
        return RequestBorderSpace.ofAddress(RequestBorderSpace$get(segment), session);
    }
    static final FunctionDescriptor SetBorderSpace$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetBorderSpace$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.SetBorderSpace$FUNC
    );
    public interface SetBorderSpace {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetBorderSpace fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetBorderSpace.class, fi, IOleInPlaceUIWindowVtbl.SetBorderSpace$FUNC, session);
        }
        static SetBorderSpace ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.SetBorderSpace$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetBorderSpace$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetBorderSpace"));
    public static VarHandle SetBorderSpace$VH() {
        return IOleInPlaceUIWindowVtbl.SetBorderSpace$VH;
    }
    public static MemoryAddress SetBorderSpace$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.SetBorderSpace$VH.get(seg);
    }
    public static void SetBorderSpace$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.SetBorderSpace$VH.set(seg, x);
    }
    public static MemoryAddress SetBorderSpace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.SetBorderSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetBorderSpace$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.SetBorderSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetBorderSpace SetBorderSpace (MemorySegment segment, MemorySession session) {
        return SetBorderSpace.ofAddress(SetBorderSpace$get(segment), session);
    }
    static final FunctionDescriptor SetActiveObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetActiveObject$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceUIWindowVtbl.SetActiveObject$FUNC
    );
    public interface SetActiveObject {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(SetActiveObject fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetActiveObject.class, fi, IOleInPlaceUIWindowVtbl.SetActiveObject$FUNC, session);
        }
        static SetActiveObject ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.SetActiveObject$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetActiveObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetActiveObject"));
    public static VarHandle SetActiveObject$VH() {
        return IOleInPlaceUIWindowVtbl.SetActiveObject$VH;
    }
    public static MemoryAddress SetActiveObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.SetActiveObject$VH.get(seg);
    }
    public static void SetActiveObject$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.SetActiveObject$VH.set(seg, x);
    }
    public static MemoryAddress SetActiveObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.SetActiveObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetActiveObject$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.SetActiveObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetActiveObject SetActiveObject (MemorySegment segment, MemorySession session) {
        return SetActiveObject.ofAddress(SetActiveObject$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


