// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD1DARBPROC {

    void apply(int x0, double x1);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD1DARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1DARBPROC.class, fi, constants$80.PFNGLMULTITEXCOORD1DARBPROC$FUNC, "(ID)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD1DARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1DARBPROC.class, fi, constants$80.PFNGLMULTITEXCOORD1DARBPROC$FUNC, "(ID)V", scope);
    }
    static PFNGLMULTITEXCOORD1DARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1) -> {
            try {
                constants$80.PFNGLMULTITEXCOORD1DARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


