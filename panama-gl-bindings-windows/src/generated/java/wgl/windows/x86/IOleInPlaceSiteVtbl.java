// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IOleInPlaceSiteVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetWindow"),
        Constants$root.C_POINTER$LAYOUT.withName("ContextSensitiveHelp"),
        Constants$root.C_POINTER$LAYOUT.withName("CanInPlaceActivate"),
        Constants$root.C_POINTER$LAYOUT.withName("OnInPlaceActivate"),
        Constants$root.C_POINTER$LAYOUT.withName("OnUIActivate"),
        Constants$root.C_POINTER$LAYOUT.withName("GetWindowContext"),
        Constants$root.C_POINTER$LAYOUT.withName("Scroll"),
        Constants$root.C_POINTER$LAYOUT.withName("OnUIDeactivate"),
        Constants$root.C_POINTER$LAYOUT.withName("OnInPlaceDeactivate"),
        Constants$root.C_POINTER$LAYOUT.withName("DiscardUndoState"),
        Constants$root.C_POINTER$LAYOUT.withName("DeactivateAndUndo"),
        Constants$root.C_POINTER$LAYOUT.withName("OnPosRectChange")
    ).withName("IOleInPlaceSiteVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleInPlaceSiteVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleInPlaceSiteVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IOleInPlaceSiteVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleInPlaceSiteVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IOleInPlaceSiteVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleInPlaceSiteVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IOleInPlaceSiteVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindow$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.GetWindow$FUNC
    );
    public interface GetWindow {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetWindow fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetWindow.class, fi, IOleInPlaceSiteVtbl.GetWindow$FUNC, session);
        }
        static GetWindow ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.GetWindow$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetWindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetWindow"));
    public static VarHandle GetWindow$VH() {
        return IOleInPlaceSiteVtbl.GetWindow$VH;
    }
    public static MemoryAddress GetWindow$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.GetWindow$VH.get(seg);
    }
    public static void GetWindow$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.GetWindow$VH.set(seg, x);
    }
    public static MemoryAddress GetWindow$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.GetWindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindow$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.GetWindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetWindow GetWindow (MemorySegment segment, MemorySession session) {
        return GetWindow.ofAddress(GetWindow$get(segment), session);
    }
    static final FunctionDescriptor ContextSensitiveHelp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ContextSensitiveHelp$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.ContextSensitiveHelp$FUNC
    );
    public interface ContextSensitiveHelp {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(ContextSensitiveHelp fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ContextSensitiveHelp.class, fi, IOleInPlaceSiteVtbl.ContextSensitiveHelp$FUNC, session);
        }
        static ContextSensitiveHelp ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.ContextSensitiveHelp$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ContextSensitiveHelp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContextSensitiveHelp"));
    public static VarHandle ContextSensitiveHelp$VH() {
        return IOleInPlaceSiteVtbl.ContextSensitiveHelp$VH;
    }
    public static MemoryAddress ContextSensitiveHelp$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.ContextSensitiveHelp$VH.get(seg);
    }
    public static void ContextSensitiveHelp$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.ContextSensitiveHelp$VH.set(seg, x);
    }
    public static MemoryAddress ContextSensitiveHelp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.ContextSensitiveHelp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextSensitiveHelp$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.ContextSensitiveHelp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ContextSensitiveHelp ContextSensitiveHelp (MemorySegment segment, MemorySession session) {
        return ContextSensitiveHelp.ofAddress(ContextSensitiveHelp$get(segment), session);
    }
    static final FunctionDescriptor CanInPlaceActivate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CanInPlaceActivate$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.CanInPlaceActivate$FUNC
    );
    public interface CanInPlaceActivate {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(CanInPlaceActivate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CanInPlaceActivate.class, fi, IOleInPlaceSiteVtbl.CanInPlaceActivate$FUNC, session);
        }
        static CanInPlaceActivate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.CanInPlaceActivate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CanInPlaceActivate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CanInPlaceActivate"));
    public static VarHandle CanInPlaceActivate$VH() {
        return IOleInPlaceSiteVtbl.CanInPlaceActivate$VH;
    }
    public static MemoryAddress CanInPlaceActivate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.CanInPlaceActivate$VH.get(seg);
    }
    public static void CanInPlaceActivate$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.CanInPlaceActivate$VH.set(seg, x);
    }
    public static MemoryAddress CanInPlaceActivate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.CanInPlaceActivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CanInPlaceActivate$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.CanInPlaceActivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CanInPlaceActivate CanInPlaceActivate (MemorySegment segment, MemorySession session) {
        return CanInPlaceActivate.ofAddress(CanInPlaceActivate$get(segment), session);
    }
    static final FunctionDescriptor OnInPlaceActivate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnInPlaceActivate$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.OnInPlaceActivate$FUNC
    );
    public interface OnInPlaceActivate {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(OnInPlaceActivate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnInPlaceActivate.class, fi, IOleInPlaceSiteVtbl.OnInPlaceActivate$FUNC, session);
        }
        static OnInPlaceActivate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.OnInPlaceActivate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnInPlaceActivate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnInPlaceActivate"));
    public static VarHandle OnInPlaceActivate$VH() {
        return IOleInPlaceSiteVtbl.OnInPlaceActivate$VH;
    }
    public static MemoryAddress OnInPlaceActivate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnInPlaceActivate$VH.get(seg);
    }
    public static void OnInPlaceActivate$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnInPlaceActivate$VH.set(seg, x);
    }
    public static MemoryAddress OnInPlaceActivate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnInPlaceActivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnInPlaceActivate$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnInPlaceActivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnInPlaceActivate OnInPlaceActivate (MemorySegment segment, MemorySession session) {
        return OnInPlaceActivate.ofAddress(OnInPlaceActivate$get(segment), session);
    }
    static final FunctionDescriptor OnUIActivate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnUIActivate$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.OnUIActivate$FUNC
    );
    public interface OnUIActivate {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(OnUIActivate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnUIActivate.class, fi, IOleInPlaceSiteVtbl.OnUIActivate$FUNC, session);
        }
        static OnUIActivate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.OnUIActivate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnUIActivate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnUIActivate"));
    public static VarHandle OnUIActivate$VH() {
        return IOleInPlaceSiteVtbl.OnUIActivate$VH;
    }
    public static MemoryAddress OnUIActivate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnUIActivate$VH.get(seg);
    }
    public static void OnUIActivate$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnUIActivate$VH.set(seg, x);
    }
    public static MemoryAddress OnUIActivate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnUIActivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnUIActivate$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnUIActivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnUIActivate OnUIActivate (MemorySegment segment, MemorySession session) {
        return OnUIActivate.ofAddress(OnUIActivate$get(segment), session);
    }
    static final FunctionDescriptor GetWindowContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowContext$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.GetWindowContext$FUNC
    );
    public interface GetWindowContext {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5);
        static MemorySegment allocate(GetWindowContext fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetWindowContext.class, fi, IOleInPlaceSiteVtbl.GetWindowContext$FUNC, session);
        }
        static GetWindowContext ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.GetWindowContext$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetWindowContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetWindowContext"));
    public static VarHandle GetWindowContext$VH() {
        return IOleInPlaceSiteVtbl.GetWindowContext$VH;
    }
    public static MemoryAddress GetWindowContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.GetWindowContext$VH.get(seg);
    }
    public static void GetWindowContext$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.GetWindowContext$VH.set(seg, x);
    }
    public static MemoryAddress GetWindowContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.GetWindowContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindowContext$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.GetWindowContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetWindowContext GetWindowContext (MemorySegment segment, MemorySession session) {
        return GetWindowContext.ofAddress(GetWindowContext$get(segment), session);
    }
    static final FunctionDescriptor Scroll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cx"),
            Constants$root.C_LONG$LAYOUT.withName("cy")
        ).withName("tagSIZE")
    );
    static final MethodHandle Scroll$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.Scroll$FUNC
    );
    public interface Scroll {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Scroll fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Scroll.class, fi, IOleInPlaceSiteVtbl.Scroll$FUNC, session);
        }
        static Scroll ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.Scroll$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Scroll$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Scroll"));
    public static VarHandle Scroll$VH() {
        return IOleInPlaceSiteVtbl.Scroll$VH;
    }
    public static MemoryAddress Scroll$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.Scroll$VH.get(seg);
    }
    public static void Scroll$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.Scroll$VH.set(seg, x);
    }
    public static MemoryAddress Scroll$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.Scroll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Scroll$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.Scroll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Scroll Scroll (MemorySegment segment, MemorySession session) {
        return Scroll.ofAddress(Scroll$get(segment), session);
    }
    static final FunctionDescriptor OnUIDeactivate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OnUIDeactivate$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.OnUIDeactivate$FUNC
    );
    public interface OnUIDeactivate {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(OnUIDeactivate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnUIDeactivate.class, fi, IOleInPlaceSiteVtbl.OnUIDeactivate$FUNC, session);
        }
        static OnUIDeactivate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.OnUIDeactivate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnUIDeactivate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnUIDeactivate"));
    public static VarHandle OnUIDeactivate$VH() {
        return IOleInPlaceSiteVtbl.OnUIDeactivate$VH;
    }
    public static MemoryAddress OnUIDeactivate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnUIDeactivate$VH.get(seg);
    }
    public static void OnUIDeactivate$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnUIDeactivate$VH.set(seg, x);
    }
    public static MemoryAddress OnUIDeactivate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnUIDeactivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnUIDeactivate$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnUIDeactivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnUIDeactivate OnUIDeactivate (MemorySegment segment, MemorySession session) {
        return OnUIDeactivate.ofAddress(OnUIDeactivate$get(segment), session);
    }
    static final FunctionDescriptor OnInPlaceDeactivate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnInPlaceDeactivate$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.OnInPlaceDeactivate$FUNC
    );
    public interface OnInPlaceDeactivate {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(OnInPlaceDeactivate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnInPlaceDeactivate.class, fi, IOleInPlaceSiteVtbl.OnInPlaceDeactivate$FUNC, session);
        }
        static OnInPlaceDeactivate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.OnInPlaceDeactivate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnInPlaceDeactivate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnInPlaceDeactivate"));
    public static VarHandle OnInPlaceDeactivate$VH() {
        return IOleInPlaceSiteVtbl.OnInPlaceDeactivate$VH;
    }
    public static MemoryAddress OnInPlaceDeactivate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnInPlaceDeactivate$VH.get(seg);
    }
    public static void OnInPlaceDeactivate$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnInPlaceDeactivate$VH.set(seg, x);
    }
    public static MemoryAddress OnInPlaceDeactivate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnInPlaceDeactivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnInPlaceDeactivate$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnInPlaceDeactivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnInPlaceDeactivate OnInPlaceDeactivate (MemorySegment segment, MemorySession session) {
        return OnInPlaceDeactivate.ofAddress(OnInPlaceDeactivate$get(segment), session);
    }
    static final FunctionDescriptor DiscardUndoState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DiscardUndoState$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.DiscardUndoState$FUNC
    );
    public interface DiscardUndoState {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(DiscardUndoState fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DiscardUndoState.class, fi, IOleInPlaceSiteVtbl.DiscardUndoState$FUNC, session);
        }
        static DiscardUndoState ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.DiscardUndoState$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DiscardUndoState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DiscardUndoState"));
    public static VarHandle DiscardUndoState$VH() {
        return IOleInPlaceSiteVtbl.DiscardUndoState$VH;
    }
    public static MemoryAddress DiscardUndoState$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.DiscardUndoState$VH.get(seg);
    }
    public static void DiscardUndoState$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.DiscardUndoState$VH.set(seg, x);
    }
    public static MemoryAddress DiscardUndoState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.DiscardUndoState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DiscardUndoState$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.DiscardUndoState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DiscardUndoState DiscardUndoState (MemorySegment segment, MemorySession session) {
        return DiscardUndoState.ofAddress(DiscardUndoState$get(segment), session);
    }
    static final FunctionDescriptor DeactivateAndUndo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeactivateAndUndo$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.DeactivateAndUndo$FUNC
    );
    public interface DeactivateAndUndo {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(DeactivateAndUndo fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DeactivateAndUndo.class, fi, IOleInPlaceSiteVtbl.DeactivateAndUndo$FUNC, session);
        }
        static DeactivateAndUndo ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.DeactivateAndUndo$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DeactivateAndUndo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeactivateAndUndo"));
    public static VarHandle DeactivateAndUndo$VH() {
        return IOleInPlaceSiteVtbl.DeactivateAndUndo$VH;
    }
    public static MemoryAddress DeactivateAndUndo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.DeactivateAndUndo$VH.get(seg);
    }
    public static void DeactivateAndUndo$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.DeactivateAndUndo$VH.set(seg, x);
    }
    public static MemoryAddress DeactivateAndUndo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.DeactivateAndUndo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeactivateAndUndo$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.DeactivateAndUndo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DeactivateAndUndo DeactivateAndUndo (MemorySegment segment, MemorySession session) {
        return DeactivateAndUndo.ofAddress(DeactivateAndUndo$get(segment), session);
    }
    static final FunctionDescriptor OnPosRectChange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnPosRectChange$MH = RuntimeHelper.downcallHandle(
        IOleInPlaceSiteVtbl.OnPosRectChange$FUNC
    );
    public interface OnPosRectChange {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(OnPosRectChange fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnPosRectChange.class, fi, IOleInPlaceSiteVtbl.OnPosRectChange$FUNC, session);
        }
        static OnPosRectChange ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleInPlaceSiteVtbl.OnPosRectChange$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnPosRectChange$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnPosRectChange"));
    public static VarHandle OnPosRectChange$VH() {
        return IOleInPlaceSiteVtbl.OnPosRectChange$VH;
    }
    public static MemoryAddress OnPosRectChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnPosRectChange$VH.get(seg);
    }
    public static void OnPosRectChange$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnPosRectChange$VH.set(seg, x);
    }
    public static MemoryAddress OnPosRectChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleInPlaceSiteVtbl.OnPosRectChange$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnPosRectChange$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceSiteVtbl.OnPosRectChange$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnPosRectChange OnPosRectChange (MemorySegment segment, MemorySession session) {
        return OnPosRectChange.ofAddress(OnPosRectChange$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


