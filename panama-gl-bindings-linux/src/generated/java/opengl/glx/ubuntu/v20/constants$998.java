// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$998 {

    static final FunctionDescriptor PFNGLDRAWMESHARRAYSSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWMESHARRAYSSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$998.PFNGLDRAWMESHARRAYSSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLREPLACEMENTCODEUISUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLREPLACEMENTCODEUISUNPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$998.PFNGLREPLACEMENTCODEUISUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLREPLACEMENTCODEUSSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT
    );
    static final MethodHandle PFNGLREPLACEMENTCODEUSSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(S)V",
        constants$998.PFNGLREPLACEMENTCODEUSSUNPROC$FUNC, false
    );
}


