// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC.class, fi, constants$817.PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC.class, fi, constants$817.PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$817.PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


