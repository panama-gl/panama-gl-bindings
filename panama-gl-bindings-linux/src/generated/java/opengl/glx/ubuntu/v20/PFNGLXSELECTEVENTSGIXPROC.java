// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXSELECTEVENTSGIXPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, long x1, long x2);
    static MemoryAddress allocate(PFNGLXSELECTEVENTSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXSELECTEVENTSGIXPROC.class, fi, constants$1054.PFNGLXSELECTEVENTSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJ)V");
    }
    static MemoryAddress allocate(PFNGLXSELECTEVENTSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXSELECTEVENTSGIXPROC.class, fi, constants$1054.PFNGLXSELECTEVENTSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJ)V", scope);
    }
    static PFNGLXSELECTEVENTSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, long x2) -> {
            try {
                constants$1054.PFNGLXSELECTEVENTSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


