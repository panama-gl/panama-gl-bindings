// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutButtonBoxFunc$callback {

    void apply(int x0, int x1);
    static MemoryAddress allocate(glutButtonBoxFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutButtonBoxFunc$callback.class, fi, constants$959.glutButtonBoxFunc$callback$FUNC, "(II)V");
    }
    static MemoryAddress allocate(glutButtonBoxFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutButtonBoxFunc$callback.class, fi, constants$959.glutButtonBoxFunc$callback$FUNC, "(II)V", scope);
    }
    static glutButtonBoxFunc$callback ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$959.glutButtonBoxFunc$callback$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


