// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD2IVARBPROC {

    void apply(int target, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLMULTITEXCOORD2IVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2IVARBPROC.class, fi, constants$85.PFNGLMULTITEXCOORD2IVARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD2IVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$85.PFNGLMULTITEXCOORD2IVARBPROC$MH.invokeExact((Addressable)symbol, _target, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

