// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLIMAGETRANSFORMPARAMETERFVHPPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLIMAGETRANSFORMPARAMETERFVHPPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLIMAGETRANSFORMPARAMETERFVHPPROC.class, fi, constants$700.PFNGLIMAGETRANSFORMPARAMETERFVHPPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLIMAGETRANSFORMPARAMETERFVHPPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLIMAGETRANSFORMPARAMETERFVHPPROC.class, fi, constants$700.PFNGLIMAGETRANSFORMPARAMETERFVHPPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLIMAGETRANSFORMPARAMETERFVHPPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$700.PFNGLIMAGETRANSFORMPARAMETERFVHPPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


