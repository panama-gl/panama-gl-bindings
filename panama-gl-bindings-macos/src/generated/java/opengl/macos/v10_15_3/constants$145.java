// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$145 {

    static final FunctionDescriptor glBeginQuery$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBeginQuery$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBeginQuery",
        "(II)V",
        constants$145.glBeginQuery$FUNC, false
    );
    static final FunctionDescriptor glEndQuery$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glEndQuery$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEndQuery",
        "(I)V",
        constants$145.glEndQuery$FUNC, false
    );
    static final FunctionDescriptor glGetQueryiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetQueryiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetQueryiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$145.glGetQueryiv$FUNC, false
    );
    static final FunctionDescriptor glGetQueryObjectiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetQueryObjectiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetQueryObjectiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$145.glGetQueryObjectiv$FUNC, false
    );
    static final FunctionDescriptor glGetQueryObjectuiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetQueryObjectuiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetQueryObjectuiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$145.glGetQueryObjectuiv$FUNC, false
    );
    static final FunctionDescriptor glBindBuffer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBindBuffer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindBuffer",
        "(II)V",
        constants$145.glBindBuffer$FUNC, false
    );
}


