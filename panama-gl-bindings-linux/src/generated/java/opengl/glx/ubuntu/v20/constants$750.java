// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$750 {

    static final FunctionDescriptor PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$750.PFNGLFRAMEBUFFERFETCHBARRIEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDIMAGETEXTUREEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDIMAGETEXTUREEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBIII)V",
        constants$750.PFNGLBINDIMAGETEXTUREEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMEMORYBARRIEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLMEMORYBARRIEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$750.PFNGLMEMORYBARRIEREXTPROC$FUNC, false
    );
}

