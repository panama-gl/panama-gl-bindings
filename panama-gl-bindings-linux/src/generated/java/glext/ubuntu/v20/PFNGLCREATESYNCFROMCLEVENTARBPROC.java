// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCREATESYNCFROMCLEVENTARBPROC {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress context, java.lang.foreign.MemoryAddress event, int flags);
    static MemorySegment allocate(PFNGLCREATESYNCFROMCLEVENTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCREATESYNCFROMCLEVENTARBPROC.class, fi, constants$430.PFNGLCREATESYNCFROMCLEVENTARBPROC$FUNC, session);
    }
    static PFNGLCREATESYNCFROMCLEVENTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _context, java.lang.foreign.MemoryAddress _event, int _flags) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$431.PFNGLCREATESYNCFROMCLEVENTARBPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_context, (java.lang.foreign.Addressable)_event, _flags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


