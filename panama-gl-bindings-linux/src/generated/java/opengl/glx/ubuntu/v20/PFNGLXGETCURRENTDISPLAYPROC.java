// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXGETCURRENTDISPLAYPROC {

    jdk.incubator.foreign.MemoryAddress apply();
    static MemoryAddress allocate(PFNGLXGETCURRENTDISPLAYPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXGETCURRENTDISPLAYPROC.class, fi, constants$1026.PFNGLXGETCURRENTDISPLAYPROC$FUNC, "()Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLXGETCURRENTDISPLAYPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXGETCURRENTDISPLAYPROC.class, fi, constants$1026.PFNGLXGETCURRENTDISPLAYPROC$FUNC, "()Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLXGETCURRENTDISPLAYPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$1026.PFNGLXGETCURRENTDISPLAYPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


