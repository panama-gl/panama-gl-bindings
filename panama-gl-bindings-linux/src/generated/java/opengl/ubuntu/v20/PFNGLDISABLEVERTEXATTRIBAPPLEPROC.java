// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDISABLEVERTEXATTRIBAPPLEPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDISABLEVERTEXATTRIBAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEVERTEXATTRIBAPPLEPROC.class, fi, constants$484.PFNGLDISABLEVERTEXATTRIBAPPLEPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDISABLEVERTEXATTRIBAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEVERTEXATTRIBAPPLEPROC.class, fi, constants$484.PFNGLDISABLEVERTEXATTRIBAPPLEPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDISABLEVERTEXATTRIBAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$484.PFNGLDISABLEVERTEXATTRIBAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


