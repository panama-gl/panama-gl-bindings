// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$918 {

    static final FunctionDescriptor PFNGLBINDTRANSFORMFEEDBACKNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDTRANSFORMFEEDBACKNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$918.PFNGLBINDTRANSFORMFEEDBACKNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETETRANSFORMFEEDBACKSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETETRANSFORMFEEDBACKSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$918.PFNGLDELETETRANSFORMFEEDBACKSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENTRANSFORMFEEDBACKSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENTRANSFORMFEEDBACKSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$918.PFNGLGENTRANSFORMFEEDBACKSNVPROC$FUNC, false
    );
}


