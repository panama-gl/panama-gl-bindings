// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCREATEMEMORYOBJECTSEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCREATEMEMORYOBJECTSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATEMEMORYOBJECTSEXTPROC.class, fi, constants$642.PFNGLCREATEMEMORYOBJECTSEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCREATEMEMORYOBJECTSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATEMEMORYOBJECTSEXTPROC.class, fi, constants$642.PFNGLCREATEMEMORYOBJECTSEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCREATEMEMORYOBJECTSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$642.PFNGLCREATEMEMORYOBJECTSEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


