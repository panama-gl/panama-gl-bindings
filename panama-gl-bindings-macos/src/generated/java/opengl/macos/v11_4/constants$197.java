// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$197 {

    static final FunctionDescriptor glutJoystickFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutJoystickFunc$func$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$197.glutJoystickFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutJoystickFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle glutJoystickFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutJoystickFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$197.glutJoystickFunc$FUNC, false
    );
    static final FunctionDescriptor glutSetColor$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glutSetColor$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSetColor",
        "(IFFF)V",
        constants$197.glutSetColor$FUNC, false
    );
    static final FunctionDescriptor glutGetColor$FUNC = FunctionDescriptor.of(C_FLOAT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutGetColor$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutGetColor",
        "(II)F",
        constants$197.glutGetColor$FUNC, false
    );
    static final FunctionDescriptor glutCopyColormap$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutCopyColormap$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutCopyColormap",
        "(I)V",
        constants$197.glutCopyColormap$FUNC, false
    );
    static final FunctionDescriptor glutGet$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle glutGet$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutGet",
        "(I)I",
        constants$197.glutGet$FUNC, false
    );
}


