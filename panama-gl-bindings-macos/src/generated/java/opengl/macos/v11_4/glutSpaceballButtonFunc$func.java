// Generated by jextract

package opengl.macos.v11_4;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutSpaceballButtonFunc$func {

    void apply(int x0, int x1);
    static MemoryAddress allocate(glutSpaceballButtonFunc$func fi) {
        return RuntimeHelper.upcallStub(glutSpaceballButtonFunc$func.class, fi, constants$191.glutSpaceballButtonFunc$func$FUNC, "(II)V");
    }
    static MemoryAddress allocate(glutSpaceballButtonFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutSpaceballButtonFunc$func.class, fi, constants$191.glutSpaceballButtonFunc$func$FUNC, "(II)V", scope);
    }
    static glutSpaceballButtonFunc$func ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$192.glutSpaceballButtonFunc$func$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


