// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWMESHTASKSNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDRAWMESHTASKSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWMESHTASKSNVPROC.class, fi, constants$867.PFNGLDRAWMESHTASKSNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDRAWMESHTASKSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWMESHTASKSNVPROC.class, fi, constants$867.PFNGLDRAWMESHTASKSNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDRAWMESHTASKSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$867.PFNGLDRAWMESHTASKSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


