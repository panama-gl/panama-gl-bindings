// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$12 {

    static final FunctionDescriptor glPointParameterfARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glPointParameterfARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPointParameterfARB",
        "(IF)V",
        constants$12.glPointParameterfARB$FUNC, false
    );
    static final FunctionDescriptor glPointParameterfvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glPointParameterfvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPointParameterfvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$12.glPointParameterfvARB$FUNC, false
    );
    static final FunctionDescriptor glProvokingVertex$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glProvokingVertex$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glProvokingVertex",
        "(I)V",
        constants$12.glProvokingVertex$FUNC, false
    );
    static final FunctionDescriptor glDeleteObjectARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glDeleteObjectARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteObjectARB",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$12.glDeleteObjectARB$FUNC, false
    );
    static final FunctionDescriptor glGetHandleARB$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle glGetHandleARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetHandleARB",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$12.glGetHandleARB$FUNC, false
    );
    static final FunctionDescriptor glDetachObjectARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glDetachObjectARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDetachObjectARB",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$12.glDetachObjectARB$FUNC, false
    );
}

