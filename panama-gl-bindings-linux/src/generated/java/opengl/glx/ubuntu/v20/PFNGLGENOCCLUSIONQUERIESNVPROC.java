// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENOCCLUSIONQUERIESNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENOCCLUSIONQUERIESNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENOCCLUSIONQUERIESNVPROC.class, fi, constants$868.PFNGLGENOCCLUSIONQUERIESNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENOCCLUSIONQUERIESNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENOCCLUSIONQUERIESNVPROC.class, fi, constants$868.PFNGLGENOCCLUSIONQUERIESNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENOCCLUSIONQUERIESNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$868.PFNGLGENOCCLUSIONQUERIESNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


