// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC {

    void apply(int texture, java.lang.foreign.MemoryAddress image, java.lang.foreign.MemoryAddress attrib_list);
    static MemorySegment allocate(PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC.class, fi, constants$601.PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC$FUNC, session);
    }
    static PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, java.lang.foreign.MemoryAddress _image, java.lang.foreign.MemoryAddress _attrib_list) -> {
            try {
                constants$601.PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC$MH.invokeExact((Addressable)symbol, _texture, (java.lang.foreign.Addressable)_image, (java.lang.foreign.Addressable)_attrib_list);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


