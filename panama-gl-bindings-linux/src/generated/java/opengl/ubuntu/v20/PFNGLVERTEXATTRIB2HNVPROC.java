// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB2HNVPROC {

    void apply(int x0, short x1, short x2);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB2HNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2HNVPROC.class, fi, constants$776.PFNGLVERTEXATTRIB2HNVPROC$FUNC, "(ISS)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB2HNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2HNVPROC.class, fi, constants$776.PFNGLVERTEXATTRIB2HNVPROC$FUNC, "(ISS)V", scope);
    }
    static PFNGLVERTEXATTRIB2HNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2) -> {
            try {
                constants$776.PFNGLVERTEXATTRIB2HNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

