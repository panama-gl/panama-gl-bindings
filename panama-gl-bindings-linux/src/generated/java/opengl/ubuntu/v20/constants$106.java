// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$106 {

    static final FunctionDescriptor PFNGLWINDOWPOS3SVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS3SVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$106.PFNGLWINDOWPOS3SVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLENDCOLORPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLBLENDCOLORPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFF)V",
        constants$106.PFNGLBLENDCOLORPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLENDEQUATIONPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLBLENDEQUATIONPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$106.PFNGLBLENDEQUATIONPROC$FUNC, false
    );
}

