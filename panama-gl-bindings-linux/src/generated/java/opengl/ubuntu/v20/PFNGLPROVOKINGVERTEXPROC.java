// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROVOKINGVERTEXPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLPROVOKINGVERTEXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROVOKINGVERTEXPROC.class, fi, constants$179.PFNGLPROVOKINGVERTEXPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLPROVOKINGVERTEXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROVOKINGVERTEXPROC.class, fi, constants$179.PFNGLPROVOKINGVERTEXPROC$FUNC, "(I)V", scope);
    }
    static PFNGLPROVOKINGVERTEXPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$179.PFNGLPROVOKINGVERTEXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

