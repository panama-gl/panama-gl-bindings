// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$56 {

    static final FunctionDescriptor glActiveStencilFaceEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glActiveStencilFaceEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glActiveStencilFaceEXT",
        "(I)V",
        constants$56.glActiveStencilFaceEXT$FUNC, false
    );
    static final FunctionDescriptor glClearColorIiEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glClearColorIiEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearColorIiEXT",
        "(IIII)V",
        constants$56.glClearColorIiEXT$FUNC, false
    );
    static final FunctionDescriptor glClearColorIuiEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glClearColorIuiEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearColorIuiEXT",
        "(IIII)V",
        constants$56.glClearColorIuiEXT$FUNC, false
    );
    static final FunctionDescriptor glTexParameterIivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexParameterIivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexParameterIivEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$56.glTexParameterIivEXT$FUNC, false
    );
    static final FunctionDescriptor glTexParameterIuivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexParameterIuivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexParameterIuivEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$56.glTexParameterIuivEXT$FUNC, false
    );
    static final FunctionDescriptor glGetTexParameterIivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexParameterIivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetTexParameterIivEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$56.glGetTexParameterIivEXT$FUNC, false
    );
}


