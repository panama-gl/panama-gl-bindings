// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISBUFFERPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISBUFFERPROC.class, fi, constants$196.PFNGLISBUFFERPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISBUFFERPROC.class, fi, constants$196.PFNGLISBUFFERPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$196.PFNGLISBUFFERPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


