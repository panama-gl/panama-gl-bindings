// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNPIXELMAPUIVARBPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETNPIXELMAPUIVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNPIXELMAPUIVARBPROC.class, fi, constants$439.PFNGLGETNPIXELMAPUIVARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNPIXELMAPUIVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNPIXELMAPUIVARBPROC.class, fi, constants$439.PFNGLGETNPIXELMAPUIVARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNPIXELMAPUIVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$439.PFNGLGETNPIXELMAPUIVARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

