// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$46 {

    static final FunctionDescriptor glTexEnviv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexEnviv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexEnviv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$46.glTexEnviv$FUNC, false
    );
    static final FunctionDescriptor glGetTexEnvfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexEnvfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetTexEnvfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$46.glGetTexEnvfv$FUNC, false
    );
    static final FunctionDescriptor glGetTexEnviv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexEnviv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetTexEnviv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$46.glGetTexEnviv$FUNC, false
    );
    static final FunctionDescriptor glTexParameterf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glTexParameterf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexParameterf",
        "(IIF)V",
        constants$46.glTexParameterf$FUNC, false
    );
    static final FunctionDescriptor glTexParameteri$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glTexParameteri$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexParameteri",
        "(III)V",
        constants$46.glTexParameteri$FUNC, false
    );
    static final FunctionDescriptor glTexParameterfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexParameterfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexParameterfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$46.glTexParameterfv$FUNC, false
    );
}

