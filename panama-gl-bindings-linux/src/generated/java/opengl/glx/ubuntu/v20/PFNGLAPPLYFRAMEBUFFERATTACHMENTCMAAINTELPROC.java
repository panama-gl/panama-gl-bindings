// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC {

    void apply();
    static MemoryAddress allocate(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC.class, fi, constants$790.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC.class, fi, constants$790.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$FUNC, "()V", scope);
    }
    static PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$790.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

