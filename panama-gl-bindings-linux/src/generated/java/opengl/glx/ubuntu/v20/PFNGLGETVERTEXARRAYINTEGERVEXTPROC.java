// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVERTEXARRAYINTEGERVEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETVERTEXARRAYINTEGERVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXARRAYINTEGERVEXTPROC.class, fi, constants$692.PFNGLGETVERTEXARRAYINTEGERVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVERTEXARRAYINTEGERVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXARRAYINTEGERVEXTPROC.class, fi, constants$692.PFNGLGETVERTEXARRAYINTEGERVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVERTEXARRAYINTEGERVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$692.PFNGLGETVERTEXARRAYINTEGERVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

