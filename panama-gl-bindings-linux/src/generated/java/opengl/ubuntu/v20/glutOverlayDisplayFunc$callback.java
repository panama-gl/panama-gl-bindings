// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutOverlayDisplayFunc$callback {

    void apply();
    static MemoryAddress allocate(glutOverlayDisplayFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutOverlayDisplayFunc$callback.class, fi, constants$957.glutOverlayDisplayFunc$callback$FUNC, "()V");
    }
    static MemoryAddress allocate(glutOverlayDisplayFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutOverlayDisplayFunc$callback.class, fi, constants$957.glutOverlayDisplayFunc$callback$FUNC, "()V", scope);
    }
    static glutOverlayDisplayFunc$callback ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$957.glutOverlayDisplayFunc$callback$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


