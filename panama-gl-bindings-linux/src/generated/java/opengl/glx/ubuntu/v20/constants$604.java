// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$604 {

    static final FunctionDescriptor PFNGLCOLORSUBTABLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOLORSUBTABLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$604.PFNGLCOLORSUBTABLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOPYCOLORSUBTABLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYCOLORSUBTABLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$604.PFNGLCOPYCOLORSUBTABLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLOCKARRAYSEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLLOCKARRAYSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$604.PFNGLLOCKARRAYSEXTPROC$FUNC, false
    );
}


