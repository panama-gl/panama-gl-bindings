// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLENDEQUATIONIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBLENDEQUATIONIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONIPROC.class, fi, constants$204.PFNGLBLENDEQUATIONIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBLENDEQUATIONIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONIPROC.class, fi, constants$204.PFNGLBLENDEQUATIONIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBLENDEQUATIONIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$204.PFNGLBLENDEQUATIONIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


