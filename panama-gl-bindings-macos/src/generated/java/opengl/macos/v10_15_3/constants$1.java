// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1 {

    static final FunctionDescriptor glDrawArraysInstancedARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glDrawArraysInstancedARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawArraysInstancedARB",
        "(IIII)V",
        constants$1.glDrawArraysInstancedARB$FUNC, false
    );
    static final FunctionDescriptor glDrawElementsInstancedARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glDrawElementsInstancedARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawElementsInstancedARB",
        "(IIILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$1.glDrawElementsInstancedARB$FUNC, false
    );
    static final FunctionDescriptor glIsRenderbuffer$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsRenderbuffer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsRenderbuffer",
        "(I)B",
        constants$1.glIsRenderbuffer$FUNC, false
    );
    static final FunctionDescriptor glBindRenderbuffer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBindRenderbuffer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindRenderbuffer",
        "(II)V",
        constants$1.glBindRenderbuffer$FUNC, false
    );
    static final FunctionDescriptor glDeleteRenderbuffers$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteRenderbuffers$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteRenderbuffers",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$1.glDeleteRenderbuffers$FUNC, false
    );
    static final FunctionDescriptor glGenRenderbuffers$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGenRenderbuffers$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenRenderbuffers",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$1.glGenRenderbuffers$FUNC, false
    );
}


