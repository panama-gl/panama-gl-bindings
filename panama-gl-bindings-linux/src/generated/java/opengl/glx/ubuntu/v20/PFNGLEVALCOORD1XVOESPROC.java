// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLEVALCOORD1XVOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLEVALCOORD1XVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEVALCOORD1XVOESPROC.class, fi, constants$514.PFNGLEVALCOORD1XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLEVALCOORD1XVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEVALCOORD1XVOESPROC.class, fi, constants$514.PFNGLEVALCOORD1XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLEVALCOORD1XVOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$514.PFNGLEVALCOORD1XVOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

