// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC {

    void apply();
    static MemoryAddress allocate(PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC.class, fi, constants$750.PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC.class, fi, constants$750.PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC$FUNC, "()V", scope);
    }
    static PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$750.PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

