// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$144 {

    static final FunctionDescriptor glWindowPos3iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos3iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$144.glWindowPos3iv$FUNC, false
    );
    static final FunctionDescriptor glWindowPos3s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glWindowPos3s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3s",
        "(SSS)V",
        constants$144.glWindowPos3s$FUNC, false
    );
    static final FunctionDescriptor glWindowPos3sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos3sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$144.glWindowPos3sv$FUNC, false
    );
    static final FunctionDescriptor glGenQueries$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGenQueries$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenQueries",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$144.glGenQueries$FUNC, false
    );
    static final FunctionDescriptor glDeleteQueries$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteQueries$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteQueries",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$144.glDeleteQueries$FUNC, false
    );
    static final FunctionDescriptor glIsQuery$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsQuery$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsQuery",
        "(I)B",
        constants$144.glIsQuery$FUNC, false
    );
}

