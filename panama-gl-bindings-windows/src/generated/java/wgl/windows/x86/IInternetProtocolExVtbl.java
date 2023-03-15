// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IInternetProtocolExVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Start"),
        Constants$root.C_POINTER$LAYOUT.withName("Continue"),
        Constants$root.C_POINTER$LAYOUT.withName("Abort"),
        Constants$root.C_POINTER$LAYOUT.withName("Terminate"),
        Constants$root.C_POINTER$LAYOUT.withName("Suspend"),
        Constants$root.C_POINTER$LAYOUT.withName("Resume"),
        Constants$root.C_POINTER$LAYOUT.withName("Read"),
        Constants$root.C_POINTER$LAYOUT.withName("Seek"),
        Constants$root.C_POINTER$LAYOUT.withName("LockRequest"),
        Constants$root.C_POINTER$LAYOUT.withName("UnlockRequest"),
        Constants$root.C_POINTER$LAYOUT.withName("StartEx")
    ).withName("IInternetProtocolExVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetProtocolExVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetProtocolExVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInternetProtocolExVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetProtocolExVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetProtocolExVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolExVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetProtocolExVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetProtocolExVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetProtocolExVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Start$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Start$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Start$FUNC
    );
    public interface Start {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, int _x4, long _x5);
        static MemorySegment allocate(Start fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Start.class, fi, IInternetProtocolExVtbl.Start$FUNC, session);
        }
        static Start ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, int __x4, long __x5) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Start$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Start$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Start"));
    public static VarHandle Start$VH() {
        return IInternetProtocolExVtbl.Start$VH;
    }
    public static MemoryAddress Start$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Start$VH.get(seg);
    }
    public static void Start$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Start$VH.set(seg, x);
    }
    public static MemoryAddress Start$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Start$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Start$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Start$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Start Start (MemorySegment segment, MemorySession session) {
        return Start.ofAddress(Start$get(segment), session);
    }
    static final FunctionDescriptor Continue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Continue$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Continue$FUNC
    );
    public interface Continue {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(Continue fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Continue.class, fi, IInternetProtocolExVtbl.Continue$FUNC, session);
        }
        static Continue ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Continue$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Continue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Continue"));
    public static VarHandle Continue$VH() {
        return IInternetProtocolExVtbl.Continue$VH;
    }
    public static MemoryAddress Continue$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Continue$VH.get(seg);
    }
    public static void Continue$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Continue$VH.set(seg, x);
    }
    public static MemoryAddress Continue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Continue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Continue$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Continue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Continue Continue (MemorySegment segment, MemorySession session) {
        return Continue.ofAddress(Continue$get(segment), session);
    }
    static final FunctionDescriptor Abort$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Abort$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Abort$FUNC
    );
    public interface Abort {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2);
        static MemorySegment allocate(Abort fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Abort.class, fi, IInternetProtocolExVtbl.Abort$FUNC, session);
        }
        static Abort ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Abort$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Abort$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Abort"));
    public static VarHandle Abort$VH() {
        return IInternetProtocolExVtbl.Abort$VH;
    }
    public static MemoryAddress Abort$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Abort$VH.get(seg);
    }
    public static void Abort$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Abort$VH.set(seg, x);
    }
    public static MemoryAddress Abort$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Abort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Abort$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Abort$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Abort Abort (MemorySegment segment, MemorySession session) {
        return Abort.ofAddress(Abort$get(segment), session);
    }
    static final FunctionDescriptor Terminate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Terminate$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Terminate$FUNC
    );
    public interface Terminate {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(Terminate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Terminate.class, fi, IInternetProtocolExVtbl.Terminate$FUNC, session);
        }
        static Terminate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Terminate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Terminate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Terminate"));
    public static VarHandle Terminate$VH() {
        return IInternetProtocolExVtbl.Terminate$VH;
    }
    public static MemoryAddress Terminate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Terminate$VH.get(seg);
    }
    public static void Terminate$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Terminate$VH.set(seg, x);
    }
    public static MemoryAddress Terminate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Terminate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Terminate$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Terminate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Terminate Terminate (MemorySegment segment, MemorySession session) {
        return Terminate.ofAddress(Terminate$get(segment), session);
    }
    static final FunctionDescriptor Suspend$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Suspend$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Suspend$FUNC
    );
    public interface Suspend {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Suspend fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Suspend.class, fi, IInternetProtocolExVtbl.Suspend$FUNC, session);
        }
        static Suspend ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Suspend$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Suspend$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Suspend"));
    public static VarHandle Suspend$VH() {
        return IInternetProtocolExVtbl.Suspend$VH;
    }
    public static MemoryAddress Suspend$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Suspend$VH.get(seg);
    }
    public static void Suspend$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Suspend$VH.set(seg, x);
    }
    public static MemoryAddress Suspend$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Suspend$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Suspend$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Suspend$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Suspend Suspend (MemorySegment segment, MemorySession session) {
        return Suspend.ofAddress(Suspend$get(segment), session);
    }
    static final FunctionDescriptor Resume$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Resume$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Resume$FUNC
    );
    public interface Resume {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Resume fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Resume.class, fi, IInternetProtocolExVtbl.Resume$FUNC, session);
        }
        static Resume ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Resume$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Resume$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Resume"));
    public static VarHandle Resume$VH() {
        return IInternetProtocolExVtbl.Resume$VH;
    }
    public static MemoryAddress Resume$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Resume$VH.get(seg);
    }
    public static void Resume$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Resume$VH.set(seg, x);
    }
    public static MemoryAddress Resume$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Resume$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Resume$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Resume$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Resume Resume (MemorySegment segment, MemorySession session) {
        return Resume.ofAddress(Resume$get(segment), session);
    }
    static final FunctionDescriptor Read$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Read$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Read$FUNC
    );
    public interface Read {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(Read fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Read.class, fi, IInternetProtocolExVtbl.Read$FUNC, session);
        }
        static Read ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Read$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Read$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Read"));
    public static VarHandle Read$VH() {
        return IInternetProtocolExVtbl.Read$VH;
    }
    public static MemoryAddress Read$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Read$VH.get(seg);
    }
    public static void Read$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Read$VH.set(seg, x);
    }
    public static MemoryAddress Read$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Read$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Read$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Read$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Read Read (MemorySegment segment, MemorySession session) {
        return Read.ofAddress(Read$get(segment), session);
    }
    static final FunctionDescriptor Seek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_LARGE_INTEGER"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Seek$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.Seek$FUNC
    );
    public interface Seek {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(Seek fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Seek.class, fi, IInternetProtocolExVtbl.Seek$FUNC, session);
        }
        static Seek ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IInternetProtocolExVtbl.Seek$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Seek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Seek"));
    public static VarHandle Seek$VH() {
        return IInternetProtocolExVtbl.Seek$VH;
    }
    public static MemoryAddress Seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Seek$VH.get(seg);
    }
    public static void Seek$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.Seek$VH.set(seg, x);
    }
    public static MemoryAddress Seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.Seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Seek$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.Seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Seek Seek (MemorySegment segment, MemorySession session) {
        return Seek.ofAddress(Seek$get(segment), session);
    }
    static final FunctionDescriptor LockRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LockRequest$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.LockRequest$FUNC
    );
    public interface LockRequest {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(LockRequest fi, MemorySession session) {
            return RuntimeHelper.upcallStub(LockRequest.class, fi, IInternetProtocolExVtbl.LockRequest$FUNC, session);
        }
        static LockRequest ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IInternetProtocolExVtbl.LockRequest$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle LockRequest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LockRequest"));
    public static VarHandle LockRequest$VH() {
        return IInternetProtocolExVtbl.LockRequest$VH;
    }
    public static MemoryAddress LockRequest$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.LockRequest$VH.get(seg);
    }
    public static void LockRequest$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.LockRequest$VH.set(seg, x);
    }
    public static MemoryAddress LockRequest$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.LockRequest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockRequest$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.LockRequest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LockRequest LockRequest (MemorySegment segment, MemorySession session) {
        return LockRequest.ofAddress(LockRequest$get(segment), session);
    }
    static final FunctionDescriptor UnlockRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnlockRequest$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.UnlockRequest$FUNC
    );
    public interface UnlockRequest {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(UnlockRequest fi, MemorySession session) {
            return RuntimeHelper.upcallStub(UnlockRequest.class, fi, IInternetProtocolExVtbl.UnlockRequest$FUNC, session);
        }
        static UnlockRequest ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolExVtbl.UnlockRequest$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnlockRequest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnlockRequest"));
    public static VarHandle UnlockRequest$VH() {
        return IInternetProtocolExVtbl.UnlockRequest$VH;
    }
    public static MemoryAddress UnlockRequest$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.UnlockRequest$VH.get(seg);
    }
    public static void UnlockRequest$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.UnlockRequest$VH.set(seg, x);
    }
    public static MemoryAddress UnlockRequest$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.UnlockRequest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnlockRequest$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.UnlockRequest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnlockRequest UnlockRequest (MemorySegment segment, MemorySession session) {
        return UnlockRequest.ofAddress(UnlockRequest$get(segment), session);
    }
    static final FunctionDescriptor StartEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle StartEx$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolExVtbl.StartEx$FUNC
    );
    public interface StartEx {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, int _x4, long _x5);
        static MemorySegment allocate(StartEx fi, MemorySession session) {
            return RuntimeHelper.upcallStub(StartEx.class, fi, IInternetProtocolExVtbl.StartEx$FUNC, session);
        }
        static StartEx ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, int __x4, long __x5) -> {
                try {
                    return (int)IInternetProtocolExVtbl.StartEx$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle StartEx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartEx"));
    public static VarHandle StartEx$VH() {
        return IInternetProtocolExVtbl.StartEx$VH;
    }
    public static MemoryAddress StartEx$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.StartEx$VH.get(seg);
    }
    public static void StartEx$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolExVtbl.StartEx$VH.set(seg, x);
    }
    public static MemoryAddress StartEx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolExVtbl.StartEx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartEx$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolExVtbl.StartEx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static StartEx StartEx (MemorySegment segment, MemorySession session) {
        return StartEx.ofAddress(StartEx$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


