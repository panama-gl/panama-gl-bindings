// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLLOADTRANSPOSEMATRIXDARBPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLLOADTRANSPOSEMATRIXDARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLOADTRANSPOSEMATRIXDARBPROC.class, fi, constants$377.PFNGLLOADTRANSPOSEMATRIXDARBPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLLOADTRANSPOSEMATRIXDARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLOADTRANSPOSEMATRIXDARBPROC.class, fi, constants$377.PFNGLLOADTRANSPOSEMATRIXDARBPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLLOADTRANSPOSEMATRIXDARBPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$377.PFNGLLOADTRANSPOSEMATRIXDARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


