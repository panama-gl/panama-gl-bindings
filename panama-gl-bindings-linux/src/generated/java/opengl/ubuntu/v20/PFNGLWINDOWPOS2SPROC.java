// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWPOS2SPROC {

    void apply(short x0, short x1);
    static MemoryAddress allocate(PFNGLWINDOWPOS2SPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2SPROC.class, fi, constants$103.PFNGLWINDOWPOS2SPROC$FUNC, "(SS)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS2SPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2SPROC.class, fi, constants$103.PFNGLWINDOWPOS2SPROC$FUNC, "(SS)V", scope);
    }
    static PFNGLWINDOWPOS2SPROC ofAddress(MemoryAddress addr) {
        return (short x0, short x1) -> {
            try {
                constants$103.PFNGLWINDOWPOS2SPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

