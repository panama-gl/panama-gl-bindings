// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISPROGRAMARBPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISPROGRAMARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISPROGRAMARBPROC.class, fi, constants$414.PFNGLISPROGRAMARBPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISPROGRAMARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISPROGRAMARBPROC.class, fi, constants$414.PFNGLISPROGRAMARBPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISPROGRAMARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$414.PFNGLISPROGRAMARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


