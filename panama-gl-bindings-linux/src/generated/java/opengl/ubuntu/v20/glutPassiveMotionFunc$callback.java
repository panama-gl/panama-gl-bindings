// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutPassiveMotionFunc$callback {

    void apply(int x0, int x1);
    static MemoryAddress allocate(glutPassiveMotionFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutPassiveMotionFunc$callback.class, fi, constants$953.glutPassiveMotionFunc$callback$FUNC, "(II)V");
    }
    static MemoryAddress allocate(glutPassiveMotionFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutPassiveMotionFunc$callback.class, fi, constants$953.glutPassiveMotionFunc$callback$FUNC, "(II)V", scope);
    }
    static glutPassiveMotionFunc$callback ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$953.glutPassiveMotionFunc$callback$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

