// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNORMALPOINTERLISTIBMPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PFNGLNORMALPOINTERLISTIBMPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNORMALPOINTERLISTIBMPROC.class, fi, constants$789.PFNGLNORMALPOINTERLISTIBMPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLNORMALPOINTERLISTIBMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNORMALPOINTERLISTIBMPROC.class, fi, constants$789.PFNGLNORMALPOINTERLISTIBMPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLNORMALPOINTERLISTIBMPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                constants$789.PFNGLNORMALPOINTERLISTIBMPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

