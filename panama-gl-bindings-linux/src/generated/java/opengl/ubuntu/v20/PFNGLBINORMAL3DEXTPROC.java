// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINORMAL3DEXTPROC {

    void apply(double x0, double x1, double x2);
    static MemoryAddress allocate(PFNGLBINORMAL3DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3DEXTPROC.class, fi, constants$528.PFNGLBINORMAL3DEXTPROC$FUNC, "(DDD)V");
    }
    static MemoryAddress allocate(PFNGLBINORMAL3DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3DEXTPROC.class, fi, constants$528.PFNGLBINORMAL3DEXTPROC$FUNC, "(DDD)V", scope);
    }
    static PFNGLBINORMAL3DEXTPROC ofAddress(MemoryAddress addr) {
        return (double x0, double x1, double x2) -> {
            try {
                constants$528.PFNGLBINORMAL3DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

