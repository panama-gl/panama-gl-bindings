// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLEDGEFLAGPOINTERLISTIBMPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, int x2);
    static MemoryAddress allocate(PFNGLEDGEFLAGPOINTERLISTIBMPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEDGEFLAGPOINTERLISTIBMPROC.class, fi, constants$788.PFNGLEDGEFLAGPOINTERLISTIBMPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLEDGEFLAGPOINTERLISTIBMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEDGEFLAGPOINTERLISTIBMPROC.class, fi, constants$788.PFNGLEDGEFLAGPOINTERLISTIBMPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLEDGEFLAGPOINTERLISTIBMPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, int x2) -> {
            try {
                constants$788.PFNGLEDGEFLAGPOINTERLISTIBMPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


