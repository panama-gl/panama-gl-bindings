// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSETLOCALCONSTANTEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLSETLOCALCONSTANTEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSETLOCALCONSTANTEXTPROC.class, fi, constants$772.PFNGLSETLOCALCONSTANTEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSETLOCALCONSTANTEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSETLOCALCONSTANTEXTPROC.class, fi, constants$772.PFNGLSETLOCALCONSTANTEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSETLOCALCONSTANTEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$772.PFNGLSETLOCALCONSTANTEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

