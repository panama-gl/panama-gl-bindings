// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWARRAYSINDIRECTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDRAWARRAYSINDIRECTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWARRAYSINDIRECTPROC.class, fi, constants$205.PFNGLDRAWARRAYSINDIRECTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDRAWARRAYSINDIRECTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWARRAYSINDIRECTPROC.class, fi, constants$205.PFNGLDRAWARRAYSINDIRECTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDRAWARRAYSINDIRECTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$205.PFNGLDRAWARRAYSINDIRECTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


