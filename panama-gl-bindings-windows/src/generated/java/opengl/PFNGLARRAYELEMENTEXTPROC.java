// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLARRAYELEMENTEXTPROC {

    void apply(int i);
    static MemorySegment allocate(PFNGLARRAYELEMENTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLARRAYELEMENTEXTPROC.class, fi, constants$695.PFNGLARRAYELEMENTEXTPROC$FUNC, session);
    }
    static PFNGLARRAYELEMENTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _i) -> {
            try {
                constants$695.PFNGLARRAYELEMENTEXTPROC$MH.invokeExact((Addressable)symbol, _i);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


