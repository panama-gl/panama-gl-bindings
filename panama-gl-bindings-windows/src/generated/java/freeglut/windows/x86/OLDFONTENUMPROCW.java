// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface OLDFONTENUMPROCW {

    int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, long _x3);
    static MemorySegment allocate(OLDFONTENUMPROCW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(OLDFONTENUMPROCW.class, fi, constants$345.OLDFONTENUMPROCW$FUNC, session);
    }
    static OLDFONTENUMPROCW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, long __x3) -> {
            try {
                return (int)constants$345.OLDFONTENUMPROCW$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


