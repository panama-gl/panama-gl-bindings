// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IOleAdviseHolderVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Advise"),
        Constants$root.C_POINTER$LAYOUT.withName("Unadvise"),
        Constants$root.C_POINTER$LAYOUT.withName("EnumAdvise"),
        Constants$root.C_POINTER$LAYOUT.withName("SendOnRename"),
        Constants$root.C_POINTER$LAYOUT.withName("SendOnSave"),
        Constants$root.C_POINTER$LAYOUT.withName("SendOnClose")
    ).withName("IOleAdviseHolderVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleAdviseHolderVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleAdviseHolderVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IOleAdviseHolderVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleAdviseHolderVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IOleAdviseHolderVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleAdviseHolderVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IOleAdviseHolderVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Advise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Advise$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.Advise$FUNC
    );
    public interface Advise {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(Advise fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Advise.class, fi, IOleAdviseHolderVtbl.Advise$FUNC, session);
        }
        static Advise ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.Advise$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Advise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Advise"));
    public static VarHandle Advise$VH() {
        return IOleAdviseHolderVtbl.Advise$VH;
    }
    public static MemoryAddress Advise$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.Advise$VH.get(seg);
    }
    public static void Advise$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.Advise$VH.set(seg, x);
    }
    public static MemoryAddress Advise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.Advise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Advise$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.Advise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Advise Advise (MemorySegment segment, MemorySession session) {
        return Advise.ofAddress(Advise$get(segment), session);
    }
    static final FunctionDescriptor Unadvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Unadvise$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.Unadvise$FUNC
    );
    public interface Unadvise {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(Unadvise fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Unadvise.class, fi, IOleAdviseHolderVtbl.Unadvise$FUNC, session);
        }
        static Unadvise ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.Unadvise$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Unadvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unadvise"));
    public static VarHandle Unadvise$VH() {
        return IOleAdviseHolderVtbl.Unadvise$VH;
    }
    public static MemoryAddress Unadvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.Unadvise$VH.get(seg);
    }
    public static void Unadvise$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.Unadvise$VH.set(seg, x);
    }
    public static MemoryAddress Unadvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.Unadvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unadvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.Unadvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unadvise Unadvise (MemorySegment segment, MemorySession session) {
        return Unadvise.ofAddress(Unadvise$get(segment), session);
    }
    static final FunctionDescriptor EnumAdvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumAdvise$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.EnumAdvise$FUNC
    );
    public interface EnumAdvise {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(EnumAdvise fi, MemorySession session) {
            return RuntimeHelper.upcallStub(EnumAdvise.class, fi, IOleAdviseHolderVtbl.EnumAdvise$FUNC, session);
        }
        static EnumAdvise ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.EnumAdvise$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumAdvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnumAdvise"));
    public static VarHandle EnumAdvise$VH() {
        return IOleAdviseHolderVtbl.EnumAdvise$VH;
    }
    public static MemoryAddress EnumAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.EnumAdvise$VH.get(seg);
    }
    public static void EnumAdvise$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.EnumAdvise$VH.set(seg, x);
    }
    public static MemoryAddress EnumAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.EnumAdvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumAdvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.EnumAdvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumAdvise EnumAdvise (MemorySegment segment, MemorySession session) {
        return EnumAdvise.ofAddress(EnumAdvise$get(segment), session);
    }
    static final FunctionDescriptor SendOnRename$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SendOnRename$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.SendOnRename$FUNC
    );
    public interface SendOnRename {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SendOnRename fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SendOnRename.class, fi, IOleAdviseHolderVtbl.SendOnRename$FUNC, session);
        }
        static SendOnRename ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.SendOnRename$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SendOnRename$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SendOnRename"));
    public static VarHandle SendOnRename$VH() {
        return IOleAdviseHolderVtbl.SendOnRename$VH;
    }
    public static MemoryAddress SendOnRename$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.SendOnRename$VH.get(seg);
    }
    public static void SendOnRename$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.SendOnRename$VH.set(seg, x);
    }
    public static MemoryAddress SendOnRename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.SendOnRename$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SendOnRename$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.SendOnRename$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SendOnRename SendOnRename (MemorySegment segment, MemorySession session) {
        return SendOnRename.ofAddress(SendOnRename$get(segment), session);
    }
    static final FunctionDescriptor SendOnSave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SendOnSave$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.SendOnSave$FUNC
    );
    public interface SendOnSave {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(SendOnSave fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SendOnSave.class, fi, IOleAdviseHolderVtbl.SendOnSave$FUNC, session);
        }
        static SendOnSave ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.SendOnSave$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SendOnSave$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SendOnSave"));
    public static VarHandle SendOnSave$VH() {
        return IOleAdviseHolderVtbl.SendOnSave$VH;
    }
    public static MemoryAddress SendOnSave$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.SendOnSave$VH.get(seg);
    }
    public static void SendOnSave$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.SendOnSave$VH.set(seg, x);
    }
    public static MemoryAddress SendOnSave$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.SendOnSave$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SendOnSave$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.SendOnSave$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SendOnSave SendOnSave (MemorySegment segment, MemorySession session) {
        return SendOnSave.ofAddress(SendOnSave$get(segment), session);
    }
    static final FunctionDescriptor SendOnClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SendOnClose$MH = RuntimeHelper.downcallHandle(
        IOleAdviseHolderVtbl.SendOnClose$FUNC
    );
    public interface SendOnClose {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(SendOnClose fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SendOnClose.class, fi, IOleAdviseHolderVtbl.SendOnClose$FUNC, session);
        }
        static SendOnClose ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleAdviseHolderVtbl.SendOnClose$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SendOnClose$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SendOnClose"));
    public static VarHandle SendOnClose$VH() {
        return IOleAdviseHolderVtbl.SendOnClose$VH;
    }
    public static MemoryAddress SendOnClose$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.SendOnClose$VH.get(seg);
    }
    public static void SendOnClose$set( MemorySegment seg, MemoryAddress x) {
        IOleAdviseHolderVtbl.SendOnClose$VH.set(seg, x);
    }
    public static MemoryAddress SendOnClose$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleAdviseHolderVtbl.SendOnClose$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SendOnClose$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleAdviseHolderVtbl.SendOnClose$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SendOnClose SendOnClose (MemorySegment segment, MemorySession session) {
        return SendOnClose.ofAddress(SendOnClose$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


