// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSECONDARYCOLOR3HNVPROC {

    void apply(short x0, short x1, short x2);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3HNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3HNVPROC.class, fi, constants$774.PFNGLSECONDARYCOLOR3HNVPROC$FUNC, "(SSS)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3HNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3HNVPROC.class, fi, constants$774.PFNGLSECONDARYCOLOR3HNVPROC$FUNC, "(SSS)V", scope);
    }
    static PFNGLSECONDARYCOLOR3HNVPROC ofAddress(MemoryAddress addr) {
        return (short x0, short x1, short x2) -> {
            try {
                constants$774.PFNGLSECONDARYCOLOR3HNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


