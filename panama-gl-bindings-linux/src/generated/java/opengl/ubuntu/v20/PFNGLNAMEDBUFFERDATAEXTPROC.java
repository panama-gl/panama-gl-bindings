// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDBUFFERDATAEXTPROC {

    void apply(int x0, long x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PFNGLNAMEDBUFFERDATAEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERDATAEXTPROC.class, fi, constants$570.PFNGLNAMEDBUFFERDATAEXTPROC$FUNC, "(IJLjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDBUFFERDATAEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERDATAEXTPROC.class, fi, constants$570.PFNGLNAMEDBUFFERDATAEXTPROC$FUNC, "(IJLjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLNAMEDBUFFERDATAEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                constants$570.PFNGLNAMEDBUFFERDATAEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


