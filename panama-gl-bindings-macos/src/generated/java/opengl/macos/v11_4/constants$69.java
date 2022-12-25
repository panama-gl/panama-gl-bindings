// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$69 {

    static final FunctionDescriptor glClear$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glClear$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClear",
        "(I)V",
        constants$69.glClear$FUNC, false
    );
    static final FunctionDescriptor glClearAccum$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glClearAccum$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearAccum",
        "(FFFF)V",
        constants$69.glClearAccum$FUNC, false
    );
    static final FunctionDescriptor glClearColor$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glClearColor$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearColor",
        "(FFFF)V",
        constants$69.glClearColor$FUNC, false
    );
    static final FunctionDescriptor glClearDepth$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glClearDepth$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearDepth",
        "(D)V",
        constants$69.glClearDepth$FUNC, false
    );
    static final FunctionDescriptor glClearIndex$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glClearIndex$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearIndex",
        "(F)V",
        constants$69.glClearIndex$FUNC, false
    );
    static final FunctionDescriptor glClearStencil$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glClearStencil$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearStencil",
        "(I)V",
        constants$69.glClearStencil$FUNC, false
    );
}

