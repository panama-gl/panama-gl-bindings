// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$40 {

    static final FunctionDescriptor glMaterialfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMaterialfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMaterialfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$40.glMaterialfv$FUNC, false
    );
    static final FunctionDescriptor glMaterialiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMaterialiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMaterialiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$40.glMaterialiv$FUNC, false
    );
    static final FunctionDescriptor glGetMaterialfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMaterialfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMaterialfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$40.glGetMaterialfv$FUNC, false
    );
    static final FunctionDescriptor glGetMaterialiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMaterialiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMaterialiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$40.glGetMaterialiv$FUNC, false
    );
    static final FunctionDescriptor glColorMaterial$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glColorMaterial$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorMaterial",
        "(II)V",
        constants$40.glColorMaterial$FUNC, false
    );
    static final FunctionDescriptor glPixelZoom$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glPixelZoom$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelZoom",
        "(FF)V",
        constants$40.glPixelZoom$FUNC, false
    );
}


