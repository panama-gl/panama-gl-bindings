// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETEMEMORYOBJECTSEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEMEMORYOBJECTSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEMEMORYOBJECTSEXTPROC.class, fi, constants$726.PFNGLDELETEMEMORYOBJECTSEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEMEMORYOBJECTSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEMEMORYOBJECTSEXTPROC.class, fi, constants$726.PFNGLDELETEMEMORYOBJECTSEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEMEMORYOBJECTSEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$726.PFNGLDELETEMEMORYOBJECTSEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

