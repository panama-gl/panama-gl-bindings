// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLQUERYRESOURCETAGNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLQUERYRESOURCETAGNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLQUERYRESOURCETAGNVPROC.class, fi, constants$812.PFNGLQUERYRESOURCETAGNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLQUERYRESOURCETAGNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLQUERYRESOURCETAGNVPROC.class, fi, constants$812.PFNGLQUERYRESOURCETAGNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLQUERYRESOURCETAGNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$812.PFNGLQUERYRESOURCETAGNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


