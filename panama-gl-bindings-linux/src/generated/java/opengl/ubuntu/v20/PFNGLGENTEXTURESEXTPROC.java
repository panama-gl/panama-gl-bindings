// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENTEXTURESEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENTEXTURESEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENTEXTURESEXTPROC.class, fi, constants$671.PFNGLGENTEXTURESEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENTEXTURESEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENTEXTURESEXTPROC.class, fi, constants$671.PFNGLGENTEXTURESEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENTEXTURESEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$671.PFNGLGENTEXTURESEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

