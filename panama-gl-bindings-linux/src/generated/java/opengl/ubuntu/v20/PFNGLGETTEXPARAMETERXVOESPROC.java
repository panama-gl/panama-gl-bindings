// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETTEXPARAMETERXVOESPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETTEXPARAMETERXVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXPARAMETERXVOESPROC.class, fi, constants$417.PFNGLGETTEXPARAMETERXVOESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETTEXPARAMETERXVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXPARAMETERXVOESPROC.class, fi, constants$417.PFNGLGETTEXPARAMETERXVOESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETTEXPARAMETERXVOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$417.PFNGLGETTEXPARAMETERXVOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


