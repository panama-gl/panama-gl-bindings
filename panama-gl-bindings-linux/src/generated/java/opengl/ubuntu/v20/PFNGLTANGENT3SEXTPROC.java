// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTANGENT3SEXTPROC {

    void apply(short x0, short x1, short x2);
    static MemoryAddress allocate(PFNGLTANGENT3SEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3SEXTPROC.class, fi, constants$527.PFNGLTANGENT3SEXTPROC$FUNC, "(SSS)V");
    }
    static MemoryAddress allocate(PFNGLTANGENT3SEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3SEXTPROC.class, fi, constants$527.PFNGLTANGENT3SEXTPROC$FUNC, "(SSS)V", scope);
    }
    static PFNGLTANGENT3SEXTPROC ofAddress(MemoryAddress addr) {
        return (short x0, short x1, short x2) -> {
            try {
                constants$527.PFNGLTANGENT3SEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


