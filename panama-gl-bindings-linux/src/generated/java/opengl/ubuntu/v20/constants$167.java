// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$167 {

    static final FunctionDescriptor PFNGLRENDERBUFFERSTORAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLRENDERBUFFERSTORAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$167.PFNGLRENDERBUFFERSTORAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETRENDERBUFFERPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETRENDERBUFFERPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$167.PFNGLGETRENDERBUFFERPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISFRAMEBUFFERPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISFRAMEBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$167.PFNGLISFRAMEBUFFERPROC$FUNC, false
    );
}


