// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$90 {

    static final FunctionDescriptor glGetMaterialiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMaterialiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMaterialiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$90.glGetMaterialiv$FUNC, false
    );
    static final FunctionDescriptor glGetMinmax$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMinmax$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMinmax",
        "(IBIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$90.glGetMinmax$FUNC, false
    );
    static final FunctionDescriptor glGetMinmaxParameterfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMinmaxParameterfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMinmaxParameterfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$90.glGetMinmaxParameterfv$FUNC, false
    );
    static final FunctionDescriptor glGetMinmaxParameteriv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMinmaxParameteriv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMinmaxParameteriv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$90.glGetMinmaxParameteriv$FUNC, false
    );
    static final FunctionDescriptor glGetPixelMapfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetPixelMapfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetPixelMapfv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$90.glGetPixelMapfv$FUNC, false
    );
    static final FunctionDescriptor glGetPixelMapuiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetPixelMapuiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetPixelMapuiv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$90.glGetPixelMapuiv$FUNC, false
    );
}


