// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$35 {

    static final FunctionDescriptor glRecti$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glRecti$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRecti",
        "(IIII)V",
        constants$35.glRecti$FUNC, false
    );
    static final FunctionDescriptor glRects$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glRects$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRects",
        "(SSSS)V",
        constants$35.glRects$FUNC, false
    );
    static final FunctionDescriptor glRectdv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectdv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectdv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$35.glRectdv$FUNC, false
    );
    static final FunctionDescriptor glRectfv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectfv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$35.glRectfv$FUNC, false
    );
    static final FunctionDescriptor glRectiv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectiv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$35.glRectiv$FUNC, false
    );
    static final FunctionDescriptor glRectsv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectsv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectsv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$35.glRectsv$FUNC, false
    );
}


