// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXSTREAM2DATIPROC {

    void apply(int x0, double x1, double x2);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM2DATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM2DATIPROC.class, fi, constants$590.PFNGLVERTEXSTREAM2DATIPROC$FUNC, "(IDD)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM2DATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM2DATIPROC.class, fi, constants$590.PFNGLVERTEXSTREAM2DATIPROC$FUNC, "(IDD)V", scope);
    }
    static PFNGLVERTEXSTREAM2DATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2) -> {
            try {
                constants$590.PFNGLVERTEXSTREAM2DATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


