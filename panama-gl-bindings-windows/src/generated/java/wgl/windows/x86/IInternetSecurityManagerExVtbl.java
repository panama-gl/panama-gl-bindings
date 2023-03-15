// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IInternetSecurityManagerExVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("SetSecuritySite"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSecuritySite"),
        Constants$root.C_POINTER$LAYOUT.withName("MapUrlToZone"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSecurityId"),
        Constants$root.C_POINTER$LAYOUT.withName("ProcessUrlAction"),
        Constants$root.C_POINTER$LAYOUT.withName("QueryCustomPolicy"),
        Constants$root.C_POINTER$LAYOUT.withName("SetZoneMapping"),
        Constants$root.C_POINTER$LAYOUT.withName("GetZoneMappings"),
        Constants$root.C_POINTER$LAYOUT.withName("ProcessUrlActionEx")
    ).withName("IInternetSecurityManagerExVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetSecurityManagerExVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetSecurityManagerExVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetSecurityManagerExVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetSecurityManagerExVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetSecurityManagerExVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetSecurityManagerExVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetSecurityManagerExVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor SetSecuritySite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSecuritySite$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.SetSecuritySite$FUNC
    );
    public interface SetSecuritySite {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetSecuritySite fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetSecuritySite.class, fi, IInternetSecurityManagerExVtbl.SetSecuritySite$FUNC, session);
        }
        static SetSecuritySite ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.SetSecuritySite$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetSecuritySite$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetSecuritySite"));
    public static VarHandle SetSecuritySite$VH() {
        return IInternetSecurityManagerExVtbl.SetSecuritySite$VH;
    }
    public static MemoryAddress SetSecuritySite$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.SetSecuritySite$VH.get(seg);
    }
    public static void SetSecuritySite$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.SetSecuritySite$VH.set(seg, x);
    }
    public static MemoryAddress SetSecuritySite$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.SetSecuritySite$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetSecuritySite$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.SetSecuritySite$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetSecuritySite SetSecuritySite (MemorySegment segment, MemorySession session) {
        return SetSecuritySite.ofAddress(SetSecuritySite$get(segment), session);
    }
    static final FunctionDescriptor GetSecuritySite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecuritySite$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.GetSecuritySite$FUNC
    );
    public interface GetSecuritySite {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetSecuritySite fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetSecuritySite.class, fi, IInternetSecurityManagerExVtbl.GetSecuritySite$FUNC, session);
        }
        static GetSecuritySite ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.GetSecuritySite$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSecuritySite$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSecuritySite"));
    public static VarHandle GetSecuritySite$VH() {
        return IInternetSecurityManagerExVtbl.GetSecuritySite$VH;
    }
    public static MemoryAddress GetSecuritySite$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.GetSecuritySite$VH.get(seg);
    }
    public static void GetSecuritySite$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.GetSecuritySite$VH.set(seg, x);
    }
    public static MemoryAddress GetSecuritySite$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.GetSecuritySite$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSecuritySite$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.GetSecuritySite$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSecuritySite GetSecuritySite (MemorySegment segment, MemorySession session) {
        return GetSecuritySite.ofAddress(GetSecuritySite$get(segment), session);
    }
    static final FunctionDescriptor MapUrlToZone$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MapUrlToZone$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.MapUrlToZone$FUNC
    );
    public interface MapUrlToZone {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(MapUrlToZone fi, MemorySession session) {
            return RuntimeHelper.upcallStub(MapUrlToZone.class, fi, IInternetSecurityManagerExVtbl.MapUrlToZone$FUNC, session);
        }
        static MapUrlToZone ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.MapUrlToZone$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle MapUrlToZone$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MapUrlToZone"));
    public static VarHandle MapUrlToZone$VH() {
        return IInternetSecurityManagerExVtbl.MapUrlToZone$VH;
    }
    public static MemoryAddress MapUrlToZone$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.MapUrlToZone$VH.get(seg);
    }
    public static void MapUrlToZone$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.MapUrlToZone$VH.set(seg, x);
    }
    public static MemoryAddress MapUrlToZone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.MapUrlToZone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MapUrlToZone$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.MapUrlToZone$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MapUrlToZone MapUrlToZone (MemorySegment segment, MemorySession session) {
        return MapUrlToZone.ofAddress(MapUrlToZone$get(segment), session);
    }
    static final FunctionDescriptor GetSecurityId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GetSecurityId$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.GetSecurityId$FUNC
    );
    public interface GetSecurityId {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, long _x4);
        static MemorySegment allocate(GetSecurityId fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetSecurityId.class, fi, IInternetSecurityManagerExVtbl.GetSecurityId$FUNC, session);
        }
        static GetSecurityId ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, long __x4) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.GetSecurityId$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSecurityId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSecurityId"));
    public static VarHandle GetSecurityId$VH() {
        return IInternetSecurityManagerExVtbl.GetSecurityId$VH;
    }
    public static MemoryAddress GetSecurityId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.GetSecurityId$VH.get(seg);
    }
    public static void GetSecurityId$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.GetSecurityId$VH.set(seg, x);
    }
    public static MemoryAddress GetSecurityId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.GetSecurityId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSecurityId$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.GetSecurityId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSecurityId GetSecurityId (MemorySegment segment, MemorySession session) {
        return GetSecurityId.ofAddress(GetSecurityId$get(segment), session);
    }
    static final FunctionDescriptor ProcessUrlAction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ProcessUrlAction$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.ProcessUrlAction$FUNC
    );
    public interface ProcessUrlAction {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3, int _x4, java.lang.foreign.MemoryAddress _x5, int _x6, int _x7, int _x8);
        static MemorySegment allocate(ProcessUrlAction fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ProcessUrlAction.class, fi, IInternetSecurityManagerExVtbl.ProcessUrlAction$FUNC, session);
        }
        static ProcessUrlAction ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3, int __x4, java.lang.foreign.MemoryAddress __x5, int __x6, int __x7, int __x8) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.ProcessUrlAction$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3, __x4, (java.lang.foreign.Addressable)__x5, __x6, __x7, __x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ProcessUrlAction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcessUrlAction"));
    public static VarHandle ProcessUrlAction$VH() {
        return IInternetSecurityManagerExVtbl.ProcessUrlAction$VH;
    }
    public static MemoryAddress ProcessUrlAction$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.ProcessUrlAction$VH.get(seg);
    }
    public static void ProcessUrlAction$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.ProcessUrlAction$VH.set(seg, x);
    }
    public static MemoryAddress ProcessUrlAction$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.ProcessUrlAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessUrlAction$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.ProcessUrlAction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ProcessUrlAction ProcessUrlAction (MemorySegment segment, MemorySession session) {
        return ProcessUrlAction.ofAddress(ProcessUrlAction$get(segment), session);
    }
    static final FunctionDescriptor QueryCustomPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle QueryCustomPolicy$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.QueryCustomPolicy$FUNC
    );
    public interface QueryCustomPolicy {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5, int _x6, int _x7);
        static MemorySegment allocate(QueryCustomPolicy fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryCustomPolicy.class, fi, IInternetSecurityManagerExVtbl.QueryCustomPolicy$FUNC, session);
        }
        static QueryCustomPolicy ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5, int __x6, int __x7) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.QueryCustomPolicy$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5, __x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryCustomPolicy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryCustomPolicy"));
    public static VarHandle QueryCustomPolicy$VH() {
        return IInternetSecurityManagerExVtbl.QueryCustomPolicy$VH;
    }
    public static MemoryAddress QueryCustomPolicy$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.QueryCustomPolicy$VH.get(seg);
    }
    public static void QueryCustomPolicy$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.QueryCustomPolicy$VH.set(seg, x);
    }
    public static MemoryAddress QueryCustomPolicy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.QueryCustomPolicy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryCustomPolicy$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.QueryCustomPolicy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryCustomPolicy QueryCustomPolicy (MemorySegment segment, MemorySession session) {
        return QueryCustomPolicy.ofAddress(QueryCustomPolicy$get(segment), session);
    }
    static final FunctionDescriptor SetZoneMapping$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetZoneMapping$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.SetZoneMapping$FUNC
    );
    public interface SetZoneMapping {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(SetZoneMapping fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetZoneMapping.class, fi, IInternetSecurityManagerExVtbl.SetZoneMapping$FUNC, session);
        }
        static SetZoneMapping ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.SetZoneMapping$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetZoneMapping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetZoneMapping"));
    public static VarHandle SetZoneMapping$VH() {
        return IInternetSecurityManagerExVtbl.SetZoneMapping$VH;
    }
    public static MemoryAddress SetZoneMapping$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.SetZoneMapping$VH.get(seg);
    }
    public static void SetZoneMapping$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.SetZoneMapping$VH.set(seg, x);
    }
    public static MemoryAddress SetZoneMapping$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.SetZoneMapping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetZoneMapping$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.SetZoneMapping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetZoneMapping SetZoneMapping (MemorySegment segment, MemorySession session) {
        return SetZoneMapping.ofAddress(SetZoneMapping$get(segment), session);
    }
    static final FunctionDescriptor GetZoneMappings$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetZoneMappings$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.GetZoneMappings$FUNC
    );
    public interface GetZoneMappings {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(GetZoneMappings fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetZoneMappings.class, fi, IInternetSecurityManagerExVtbl.GetZoneMappings$FUNC, session);
        }
        static GetZoneMappings ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.GetZoneMappings$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetZoneMappings$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetZoneMappings"));
    public static VarHandle GetZoneMappings$VH() {
        return IInternetSecurityManagerExVtbl.GetZoneMappings$VH;
    }
    public static MemoryAddress GetZoneMappings$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.GetZoneMappings$VH.get(seg);
    }
    public static void GetZoneMappings$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.GetZoneMappings$VH.set(seg, x);
    }
    public static MemoryAddress GetZoneMappings$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.GetZoneMappings$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetZoneMappings$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.GetZoneMappings$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetZoneMappings GetZoneMappings (MemorySegment segment, MemorySession session) {
        return GetZoneMappings.ofAddress(GetZoneMappings$get(segment), session);
    }
    static final FunctionDescriptor ProcessUrlActionEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ProcessUrlActionEx$MH = RuntimeHelper.downcallHandle(
        IInternetSecurityManagerExVtbl.ProcessUrlActionEx$FUNC
    );
    public interface ProcessUrlActionEx {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3, int _x4, java.lang.foreign.MemoryAddress _x5, int _x6, int _x7, int _x8, java.lang.foreign.MemoryAddress _x9);
        static MemorySegment allocate(ProcessUrlActionEx fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ProcessUrlActionEx.class, fi, IInternetSecurityManagerExVtbl.ProcessUrlActionEx$FUNC, session);
        }
        static ProcessUrlActionEx ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3, int __x4, java.lang.foreign.MemoryAddress __x5, int __x6, int __x7, int __x8, java.lang.foreign.MemoryAddress __x9) -> {
                try {
                    return (int)IInternetSecurityManagerExVtbl.ProcessUrlActionEx$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3, __x4, (java.lang.foreign.Addressable)__x5, __x6, __x7, __x8, (java.lang.foreign.Addressable)__x9);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ProcessUrlActionEx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcessUrlActionEx"));
    public static VarHandle ProcessUrlActionEx$VH() {
        return IInternetSecurityManagerExVtbl.ProcessUrlActionEx$VH;
    }
    public static MemoryAddress ProcessUrlActionEx$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.ProcessUrlActionEx$VH.get(seg);
    }
    public static void ProcessUrlActionEx$set( MemorySegment seg, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.ProcessUrlActionEx$VH.set(seg, x);
    }
    public static MemoryAddress ProcessUrlActionEx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSecurityManagerExVtbl.ProcessUrlActionEx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessUrlActionEx$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSecurityManagerExVtbl.ProcessUrlActionEx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ProcessUrlActionEx ProcessUrlActionEx (MemorySegment segment, MemorySession session) {
        return ProcessUrlActionEx.ofAddress(ProcessUrlActionEx$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


