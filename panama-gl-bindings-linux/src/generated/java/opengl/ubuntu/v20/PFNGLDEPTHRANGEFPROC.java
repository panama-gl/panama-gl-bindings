// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDEPTHRANGEFPROC {

    void apply(float x0, float x1);
    static MemoryAddress allocate(PFNGLDEPTHRANGEFPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHRANGEFPROC.class, fi, constants$220.PFNGLDEPTHRANGEFPROC$FUNC, "(FF)V");
    }
    static MemoryAddress allocate(PFNGLDEPTHRANGEFPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHRANGEFPROC.class, fi, constants$220.PFNGLDEPTHRANGEFPROC$FUNC, "(FF)V", scope);
    }
    static PFNGLDEPTHRANGEFPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1) -> {
            try {
                constants$220.PFNGLDEPTHRANGEFPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


