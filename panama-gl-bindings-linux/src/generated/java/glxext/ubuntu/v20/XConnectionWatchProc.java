// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface XConnectionWatchProc {

    void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, int _x3, java.lang.foreign.MemoryAddress _x4);
    static MemorySegment allocate(XConnectionWatchProc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(XConnectionWatchProc.class, fi, constants$71.XConnectionWatchProc$FUNC, session);
    }
    static XConnectionWatchProc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, int __x3, java.lang.foreign.MemoryAddress __x4) -> {
            try {
                constants$71.XConnectionWatchProc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, (java.lang.foreign.Addressable)__x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


