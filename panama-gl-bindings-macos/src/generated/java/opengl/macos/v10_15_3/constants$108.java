// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$108 {

    static final FunctionDescriptor glRasterPos2dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos2dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos2dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$108.glRasterPos2dv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glRasterPos2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos2f",
        "(FF)V",
        constants$108.glRasterPos2f$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos2fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos2fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$108.glRasterPos2fv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glRasterPos2i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos2i",
        "(II)V",
        constants$108.glRasterPos2i$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos2iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos2iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$108.glRasterPos2iv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glRasterPos2s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos2s",
        "(SS)V",
        constants$108.glRasterPos2s$FUNC, false
    );
}

