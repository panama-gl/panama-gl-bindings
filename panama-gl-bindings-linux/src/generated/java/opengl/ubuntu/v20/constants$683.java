// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$683 {

    static final FunctionDescriptor PFNGLGENVERTEXSHADERSEXTPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGENVERTEXSHADERSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$683.PFNGLGENVERTEXSHADERSEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEVERTEXSHADEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLDELETEVERTEXSHADEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$683.PFNGLDELETEVERTEXSHADEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSHADEROP1EXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSHADEROP1EXTPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$683.PFNGLSHADEROP1EXTPROC$FUNC, false
    );
}


