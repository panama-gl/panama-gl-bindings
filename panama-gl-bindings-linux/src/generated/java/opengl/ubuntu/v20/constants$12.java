// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$12 {

    static final FunctionDescriptor glCallLists$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glCallLists$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCallLists",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$12.glCallLists$FUNC, false
    );
    static final FunctionDescriptor glListBase$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glListBase$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glListBase",
        "(I)V",
        constants$12.glListBase$FUNC, false
    );
    static final FunctionDescriptor glBegin$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glBegin$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBegin",
        "(I)V",
        constants$12.glBegin$FUNC, false
    );
    static final FunctionDescriptor glEnd$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glEnd$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEnd",
        "()V",
        constants$12.glEnd$FUNC, false
    );
    static final FunctionDescriptor glVertex2d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glVertex2d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2d",
        "(DD)V",
        constants$12.glVertex2d$FUNC, false
    );
    static final FunctionDescriptor glVertex2f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glVertex2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2f",
        "(FF)V",
        constants$12.glVertex2f$FUNC, false
    );
}


