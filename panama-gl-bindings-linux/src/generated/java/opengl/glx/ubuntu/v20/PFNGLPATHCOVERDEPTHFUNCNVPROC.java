// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPATHCOVERDEPTHFUNCNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLPATHCOVERDEPTHFUNCNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPATHCOVERDEPTHFUNCNVPROC.class, fi, constants$880.PFNGLPATHCOVERDEPTHFUNCNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLPATHCOVERDEPTHFUNCNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPATHCOVERDEPTHFUNCNVPROC.class, fi, constants$880.PFNGLPATHCOVERDEPTHFUNCNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLPATHCOVERDEPTHFUNCNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$880.PFNGLPATHCOVERDEPTHFUNCNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


