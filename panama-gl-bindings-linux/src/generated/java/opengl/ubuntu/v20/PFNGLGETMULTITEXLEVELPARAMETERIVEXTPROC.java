// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC.class, fi, constants$559.PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC.class, fi, constants$559.PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$559.PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


