// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$370 {

    static final FunctionDescriptor PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$370.PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATETEXTURESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATETEXTURESPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$370.PFNGLCREATETEXTURESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTUREBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXTUREBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$370.PFNGLTEXTUREBUFFERPROC$FUNC, false
    );
}


