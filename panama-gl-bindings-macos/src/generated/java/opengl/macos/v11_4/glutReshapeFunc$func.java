// Generated by jextract

package opengl.macos.v11_4;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutReshapeFunc$func {

    void apply(int x0, int x1);
    static MemoryAddress allocate(glutReshapeFunc$func fi) {
        return RuntimeHelper.upcallStub(glutReshapeFunc$func.class, fi, constants$185.glutReshapeFunc$func$FUNC, "(II)V");
    }
    static MemoryAddress allocate(glutReshapeFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutReshapeFunc$func.class, fi, constants$185.glutReshapeFunc$func$FUNC, "(II)V", scope);
    }
    static glutReshapeFunc$func ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$185.glutReshapeFunc$func$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

