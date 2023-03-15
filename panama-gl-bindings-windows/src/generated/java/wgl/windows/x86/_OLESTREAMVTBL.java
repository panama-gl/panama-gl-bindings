// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OLESTREAMVTBL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Get"),
        Constants$root.C_POINTER$LAYOUT.withName("Put")
    ).withName("_OLESTREAMVTBL");
    public static MemoryLayout $LAYOUT() {
        return _OLESTREAMVTBL.$struct$LAYOUT;
    }
    static final FunctionDescriptor Get$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Get$MH = RuntimeHelper.downcallHandle(
        _OLESTREAMVTBL.Get$FUNC
    );
    public interface Get {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2);
        static MemorySegment allocate(Get fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Get.class, fi, _OLESTREAMVTBL.Get$FUNC, session);
        }
        static Get ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2) -> {
                try {
                    return (int)_OLESTREAMVTBL.Get$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Get$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Get"));
    public static VarHandle Get$VH() {
        return _OLESTREAMVTBL.Get$VH;
    }
    public static MemoryAddress Get$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OLESTREAMVTBL.Get$VH.get(seg);
    }
    public static void Get$set( MemorySegment seg, MemoryAddress x) {
        _OLESTREAMVTBL.Get$VH.set(seg, x);
    }
    public static MemoryAddress Get$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OLESTREAMVTBL.Get$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Get$set(MemorySegment seg, long index, MemoryAddress x) {
        _OLESTREAMVTBL.Get$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Get Get (MemorySegment segment, MemorySession session) {
        return Get.ofAddress(Get$get(segment), session);
    }
    static final FunctionDescriptor Put$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Put$MH = RuntimeHelper.downcallHandle(
        _OLESTREAMVTBL.Put$FUNC
    );
    public interface Put {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2);
        static MemorySegment allocate(Put fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Put.class, fi, _OLESTREAMVTBL.Put$FUNC, session);
        }
        static Put ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2) -> {
                try {
                    return (int)_OLESTREAMVTBL.Put$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Put$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Put"));
    public static VarHandle Put$VH() {
        return _OLESTREAMVTBL.Put$VH;
    }
    public static MemoryAddress Put$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OLESTREAMVTBL.Put$VH.get(seg);
    }
    public static void Put$set( MemorySegment seg, MemoryAddress x) {
        _OLESTREAMVTBL.Put$VH.set(seg, x);
    }
    public static MemoryAddress Put$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OLESTREAMVTBL.Put$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Put$set(MemorySegment seg, long index, MemoryAddress x) {
        _OLESTREAMVTBL.Put$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Put Put (MemorySegment segment, MemorySession session) {
        return Put.ofAddress(Put$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


