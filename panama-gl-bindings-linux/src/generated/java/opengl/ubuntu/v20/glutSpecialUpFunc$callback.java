// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutSpecialUpFunc$callback {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(glutSpecialUpFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutSpecialUpFunc$callback.class, fi, constants$955.glutSpecialUpFunc$callback$FUNC, "(III)V");
    }
    static MemoryAddress allocate(glutSpecialUpFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutSpecialUpFunc$callback.class, fi, constants$955.glutSpecialUpFunc$callback$FUNC, "(III)V", scope);
    }
    static glutSpecialUpFunc$callback ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$955.glutSpecialUpFunc$callback$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

