// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$237 {

    static final FunctionDescriptor PFNGLGETVERTEXATTRIBIIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBIIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$237.PFNGLGETVERTEXATTRIBIIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBIUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBIUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$237.PFNGLGETVERTEXATTRIBIUIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBI1IPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBI1IPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$237.PFNGLVERTEXATTRIBI1IPROC$FUNC, false
    );
}

