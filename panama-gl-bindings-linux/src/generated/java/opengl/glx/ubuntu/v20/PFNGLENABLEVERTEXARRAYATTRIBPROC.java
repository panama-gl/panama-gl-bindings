// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLENABLEVERTEXARRAYATTRIBPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLENABLEVERTEXARRAYATTRIBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENABLEVERTEXARRAYATTRIBPROC.class, fi, constants$382.PFNGLENABLEVERTEXARRAYATTRIBPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLENABLEVERTEXARRAYATTRIBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENABLEVERTEXARRAYATTRIBPROC.class, fi, constants$382.PFNGLENABLEVERTEXARRAYATTRIBPROC$FUNC, "(II)V", scope);
    }
    static PFNGLENABLEVERTEXARRAYATTRIBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$382.PFNGLENABLEVERTEXARRAYATTRIBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


