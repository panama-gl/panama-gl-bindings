// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC.class, fi, constants$907.PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC.class, fi, constants$907.PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$907.PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


