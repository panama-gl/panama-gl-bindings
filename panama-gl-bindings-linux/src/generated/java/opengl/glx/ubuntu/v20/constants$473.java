// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$473 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB2FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB2FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFF)V",
        constants$473.PFNGLVERTEXATTRIB2FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB2FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$473.PFNGLVERTEXATTRIB2FVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB2SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ISS)V",
        constants$473.PFNGLVERTEXATTRIB2SARBPROC$FUNC, false
    );
}


