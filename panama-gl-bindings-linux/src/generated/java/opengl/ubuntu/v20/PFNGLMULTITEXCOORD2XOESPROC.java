// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD2XOESPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD2XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2XOESPROC.class, fi, constants$436.PFNGLMULTITEXCOORD2XOESPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD2XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2XOESPROC.class, fi, constants$436.PFNGLMULTITEXCOORD2XOESPROC$FUNC, "(III)V", scope);
    }
    static PFNGLMULTITEXCOORD2XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$436.PFNGLMULTITEXCOORD2XOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


