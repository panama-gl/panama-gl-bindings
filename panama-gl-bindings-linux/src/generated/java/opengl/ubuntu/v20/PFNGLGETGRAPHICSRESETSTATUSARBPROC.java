// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETGRAPHICSRESETSTATUSARBPROC {

    int apply();
    static MemoryAddress allocate(PFNGLGETGRAPHICSRESETSTATUSARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETGRAPHICSRESETSTATUSARBPROC.class, fi, constants$349.PFNGLGETGRAPHICSRESETSTATUSARBPROC$FUNC, "()I");
    }
    static MemoryAddress allocate(PFNGLGETGRAPHICSRESETSTATUSARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETGRAPHICSRESETSTATUSARBPROC.class, fi, constants$349.PFNGLGETGRAPHICSRESETSTATUSARBPROC$FUNC, "()I", scope);
    }
    static PFNGLGETGRAPHICSRESETSTATUSARBPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                return (int)constants$349.PFNGLGETGRAPHICSRESETSTATUSARBPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


