// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXCOORD4FVERTEX4FVSUNPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLTEXCOORD4FVERTEX4FVSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD4FVERTEX4FVSUNPROC.class, fi, constants$919.PFNGLTEXCOORD4FVERTEX4FVSUNPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXCOORD4FVERTEX4FVSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD4FVERTEX4FVSUNPROC.class, fi, constants$919.PFNGLTEXCOORD4FVERTEX4FVSUNPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXCOORD4FVERTEX4FVSUNPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$919.PFNGLTEXCOORD4FVERTEX4FVSUNPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

