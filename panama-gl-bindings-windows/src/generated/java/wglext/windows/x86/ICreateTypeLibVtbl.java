// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ICreateTypeLibVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("CreateTypeInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("SetName"),
        Constants$root.C_POINTER$LAYOUT.withName("SetVersion"),
        Constants$root.C_POINTER$LAYOUT.withName("SetGuid"),
        Constants$root.C_POINTER$LAYOUT.withName("SetDocString"),
        Constants$root.C_POINTER$LAYOUT.withName("SetHelpFileName"),
        Constants$root.C_POINTER$LAYOUT.withName("SetHelpContext"),
        Constants$root.C_POINTER$LAYOUT.withName("SetLcid"),
        Constants$root.C_POINTER$LAYOUT.withName("SetLibFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("SaveAllChanges")
    ).withName("ICreateTypeLibVtbl");
    public static MemoryLayout $LAYOUT() {
        return ICreateTypeLibVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ICreateTypeLibVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)ICreateTypeLibVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return ICreateTypeLibVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ICreateTypeLibVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ICreateTypeLibVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return ICreateTypeLibVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, ICreateTypeLibVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ICreateTypeLibVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return ICreateTypeLibVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor CreateTypeInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateTypeInfo$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.CreateTypeInfo$FUNC
    );
    public interface CreateTypeInfo {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(CreateTypeInfo fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CreateTypeInfo.class, fi, ICreateTypeLibVtbl.CreateTypeInfo$FUNC, session);
        }
        static CreateTypeInfo ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)ICreateTypeLibVtbl.CreateTypeInfo$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateTypeInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreateTypeInfo"));
    public static VarHandle CreateTypeInfo$VH() {
        return ICreateTypeLibVtbl.CreateTypeInfo$VH;
    }
    public static MemoryAddress CreateTypeInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.CreateTypeInfo$VH.get(seg);
    }
    public static void CreateTypeInfo$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.CreateTypeInfo$VH.set(seg, x);
    }
    public static MemoryAddress CreateTypeInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.CreateTypeInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateTypeInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.CreateTypeInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateTypeInfo CreateTypeInfo (MemorySegment segment, MemorySession session) {
        return CreateTypeInfo.ofAddress(CreateTypeInfo$get(segment), session);
    }
    static final FunctionDescriptor SetName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetName$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SetName$FUNC
    );
    public interface SetName {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetName fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetName.class, fi, ICreateTypeLibVtbl.SetName$FUNC, session);
        }
        static SetName ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetName$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetName"));
    public static VarHandle SetName$VH() {
        return ICreateTypeLibVtbl.SetName$VH;
    }
    public static MemoryAddress SetName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetName$VH.get(seg);
    }
    public static void SetName$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetName$VH.set(seg, x);
    }
    public static MemoryAddress SetName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetName$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetName SetName (MemorySegment segment, MemorySession session) {
        return SetName.ofAddress(SetName$get(segment), session);
    }
    static final FunctionDescriptor SetVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle SetVersion$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SetVersion$FUNC
    );
    public interface SetVersion {

        int apply(java.lang.foreign.MemoryAddress _x0, short _x1, short _x2);
        static MemorySegment allocate(SetVersion fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetVersion.class, fi, ICreateTypeLibVtbl.SetVersion$FUNC, session);
        }
        static SetVersion ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, short __x1, short __x2) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetVersion$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetVersion"));
    public static VarHandle SetVersion$VH() {
        return ICreateTypeLibVtbl.SetVersion$VH;
    }
    public static MemoryAddress SetVersion$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetVersion$VH.get(seg);
    }
    public static void SetVersion$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetVersion$VH.set(seg, x);
    }
    public static MemoryAddress SetVersion$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetVersion$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetVersion SetVersion (MemorySegment segment, MemorySession session) {
        return SetVersion.ofAddress(SetVersion$get(segment), session);
    }
    static final FunctionDescriptor SetGuid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetGuid$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SetGuid$FUNC
    );
    public interface SetGuid {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetGuid fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetGuid.class, fi, ICreateTypeLibVtbl.SetGuid$FUNC, session);
        }
        static SetGuid ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetGuid$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetGuid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetGuid"));
    public static VarHandle SetGuid$VH() {
        return ICreateTypeLibVtbl.SetGuid$VH;
    }
    public static MemoryAddress SetGuid$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetGuid$VH.get(seg);
    }
    public static void SetGuid$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetGuid$VH.set(seg, x);
    }
    public static MemoryAddress SetGuid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetGuid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetGuid$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetGuid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetGuid SetGuid (MemorySegment segment, MemorySession session) {
        return SetGuid.ofAddress(SetGuid$get(segment), session);
    }
    static final FunctionDescriptor SetDocString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDocString$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SetDocString$FUNC
    );
    public interface SetDocString {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetDocString fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetDocString.class, fi, ICreateTypeLibVtbl.SetDocString$FUNC, session);
        }
        static SetDocString ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetDocString$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetDocString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetDocString"));
    public static VarHandle SetDocString$VH() {
        return ICreateTypeLibVtbl.SetDocString$VH;
    }
    public static MemoryAddress SetDocString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetDocString$VH.get(seg);
    }
    public static void SetDocString$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetDocString$VH.set(seg, x);
    }
    public static MemoryAddress SetDocString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetDocString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetDocString$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetDocString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetDocString SetDocString (MemorySegment segment, MemorySession session) {
        return SetDocString.ofAddress(SetDocString$get(segment), session);
    }
    static final FunctionDescriptor SetHelpFileName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetHelpFileName$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SetHelpFileName$FUNC
    );
    public interface SetHelpFileName {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetHelpFileName fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetHelpFileName.class, fi, ICreateTypeLibVtbl.SetHelpFileName$FUNC, session);
        }
        static SetHelpFileName ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetHelpFileName$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetHelpFileName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetHelpFileName"));
    public static VarHandle SetHelpFileName$VH() {
        return ICreateTypeLibVtbl.SetHelpFileName$VH;
    }
    public static MemoryAddress SetHelpFileName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetHelpFileName$VH.get(seg);
    }
    public static void SetHelpFileName$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetHelpFileName$VH.set(seg, x);
    }
    public static MemoryAddress SetHelpFileName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetHelpFileName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetHelpFileName$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetHelpFileName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetHelpFileName SetHelpFileName (MemorySegment segment, MemorySession session) {
        return SetHelpFileName.ofAddress(SetHelpFileName$get(segment), session);
    }
    static final FunctionDescriptor SetHelpContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetHelpContext$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SetHelpContext$FUNC
    );
    public interface SetHelpContext {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(SetHelpContext fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetHelpContext.class, fi, ICreateTypeLibVtbl.SetHelpContext$FUNC, session);
        }
        static SetHelpContext ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetHelpContext$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetHelpContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetHelpContext"));
    public static VarHandle SetHelpContext$VH() {
        return ICreateTypeLibVtbl.SetHelpContext$VH;
    }
    public static MemoryAddress SetHelpContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetHelpContext$VH.get(seg);
    }
    public static void SetHelpContext$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetHelpContext$VH.set(seg, x);
    }
    public static MemoryAddress SetHelpContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetHelpContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetHelpContext$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetHelpContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetHelpContext SetHelpContext (MemorySegment segment, MemorySession session) {
        return SetHelpContext.ofAddress(SetHelpContext$get(segment), session);
    }
    static final FunctionDescriptor SetLcid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetLcid$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SetLcid$FUNC
    );
    public interface SetLcid {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(SetLcid fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetLcid.class, fi, ICreateTypeLibVtbl.SetLcid$FUNC, session);
        }
        static SetLcid ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetLcid$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetLcid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetLcid"));
    public static VarHandle SetLcid$VH() {
        return ICreateTypeLibVtbl.SetLcid$VH;
    }
    public static MemoryAddress SetLcid$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetLcid$VH.get(seg);
    }
    public static void SetLcid$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetLcid$VH.set(seg, x);
    }
    public static MemoryAddress SetLcid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetLcid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetLcid$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetLcid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetLcid SetLcid (MemorySegment segment, MemorySession session) {
        return SetLcid.ofAddress(SetLcid$get(segment), session);
    }
    static final FunctionDescriptor SetLibFlags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetLibFlags$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SetLibFlags$FUNC
    );
    public interface SetLibFlags {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(SetLibFlags fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetLibFlags.class, fi, ICreateTypeLibVtbl.SetLibFlags$FUNC, session);
        }
        static SetLibFlags ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetLibFlags$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetLibFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetLibFlags"));
    public static VarHandle SetLibFlags$VH() {
        return ICreateTypeLibVtbl.SetLibFlags$VH;
    }
    public static MemoryAddress SetLibFlags$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetLibFlags$VH.get(seg);
    }
    public static void SetLibFlags$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetLibFlags$VH.set(seg, x);
    }
    public static MemoryAddress SetLibFlags$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SetLibFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetLibFlags$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetLibFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetLibFlags SetLibFlags (MemorySegment segment, MemorySession session) {
        return SetLibFlags.ofAddress(SetLibFlags$get(segment), session);
    }
    static final FunctionDescriptor SaveAllChanges$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SaveAllChanges$MH = RuntimeHelper.downcallHandle(
        ICreateTypeLibVtbl.SaveAllChanges$FUNC
    );
    public interface SaveAllChanges {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(SaveAllChanges fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SaveAllChanges.class, fi, ICreateTypeLibVtbl.SaveAllChanges$FUNC, session);
        }
        static SaveAllChanges ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SaveAllChanges$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SaveAllChanges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SaveAllChanges"));
    public static VarHandle SaveAllChanges$VH() {
        return ICreateTypeLibVtbl.SaveAllChanges$VH;
    }
    public static MemoryAddress SaveAllChanges$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SaveAllChanges$VH.get(seg);
    }
    public static void SaveAllChanges$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SaveAllChanges$VH.set(seg, x);
    }
    public static MemoryAddress SaveAllChanges$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ICreateTypeLibVtbl.SaveAllChanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SaveAllChanges$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SaveAllChanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SaveAllChanges SaveAllChanges (MemorySegment segment, MemorySession session) {
        return SaveAllChanges.ofAddress(SaveAllChanges$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


