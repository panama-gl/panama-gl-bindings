// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LANGUAGEGROUP_ENUMPROCW {

    int apply(int _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3, long _x4);
    static MemorySegment allocate(LANGUAGEGROUP_ENUMPROCW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LANGUAGEGROUP_ENUMPROCW.class, fi, constants$543.LANGUAGEGROUP_ENUMPROCW$FUNC, session);
    }
    static LANGUAGEGROUP_ENUMPROCW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3, long __x4) -> {
            try {
                return (int)constants$543.LANGUAGEGROUP_ENUMPROCW$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3, __x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


