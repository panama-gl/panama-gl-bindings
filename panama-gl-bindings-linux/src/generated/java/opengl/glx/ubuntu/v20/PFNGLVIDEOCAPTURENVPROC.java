// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVIDEOCAPTURENVPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLVIDEOCAPTURENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVIDEOCAPTURENVPROC.class, fi, constants$966.PFNGLVIDEOCAPTURENVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLVIDEOCAPTURENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVIDEOCAPTURENVPROC.class, fi, constants$966.PFNGLVIDEOCAPTURENVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLVIDEOCAPTURENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                return (int)constants$966.PFNGLVIDEOCAPTURENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


