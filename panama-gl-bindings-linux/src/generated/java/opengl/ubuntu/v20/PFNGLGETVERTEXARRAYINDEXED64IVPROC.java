// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVERTEXARRAYINDEXED64IVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETVERTEXARRAYINDEXED64IVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXARRAYINDEXED64IVPROC.class, fi, constants$300.PFNGLGETVERTEXARRAYINDEXED64IVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVERTEXARRAYINDEXED64IVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXARRAYINDEXED64IVPROC.class, fi, constants$300.PFNGLGETVERTEXARRAYINDEXED64IVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVERTEXARRAYINDEXED64IVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$300.PFNGLGETVERTEXARRAYINDEXED64IVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


