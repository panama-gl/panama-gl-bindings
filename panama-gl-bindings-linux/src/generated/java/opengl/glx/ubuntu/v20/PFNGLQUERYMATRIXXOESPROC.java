// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLQUERYMATRIXXOESPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLQUERYMATRIXXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLQUERYMATRIXXOESPROC.class, fi, constants$533.PFNGLQUERYMATRIXXOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLQUERYMATRIXXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLQUERYMATRIXXOESPROC.class, fi, constants$533.PFNGLQUERYMATRIXXOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLQUERYMATRIXXOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$533.PFNGLQUERYMATRIXXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


