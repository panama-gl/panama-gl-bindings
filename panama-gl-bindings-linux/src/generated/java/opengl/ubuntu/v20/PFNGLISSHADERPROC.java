// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISSHADERPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISSHADERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISSHADERPROC.class, fi, constants$124.PFNGLISSHADERPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISSHADERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISSHADERPROC.class, fi, constants$124.PFNGLISSHADERPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISSHADERPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$124.PFNGLISSHADERPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


