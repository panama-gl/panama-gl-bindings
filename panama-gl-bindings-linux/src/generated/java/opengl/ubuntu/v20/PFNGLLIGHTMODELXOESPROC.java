// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLLIGHTMODELXOESPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLLIGHTMODELXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLIGHTMODELXOESPROC.class, fi, constants$418.PFNGLLIGHTMODELXOESPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLLIGHTMODELXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLIGHTMODELXOESPROC.class, fi, constants$418.PFNGLLIGHTMODELXOESPROC$FUNC, "(II)V", scope);
    }
    static PFNGLLIGHTMODELXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$418.PFNGLLIGHTMODELXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

