// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface on_exit$__func {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(on_exit$__func fi) {
        return RuntimeHelper.upcallStub(on_exit$__func.class, fi, constants$980.on_exit$__func$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(on_exit$__func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(on_exit$__func.class, fi, constants$980.on_exit$__func$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static on_exit$__func ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$980.on_exit$__func$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

