// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVARIANTARRAYOBJECTIVATIPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETVARIANTARRAYOBJECTIVATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVARIANTARRAYOBJECTIVATIPROC.class, fi, constants$499.PFNGLGETVARIANTARRAYOBJECTIVATIPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVARIANTARRAYOBJECTIVATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVARIANTARRAYOBJECTIVATIPROC.class, fi, constants$499.PFNGLGETVARIANTARRAYOBJECTIVATIPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVARIANTARRAYOBJECTIVATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$499.PFNGLGETVARIANTARRAYOBJECTIVATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


