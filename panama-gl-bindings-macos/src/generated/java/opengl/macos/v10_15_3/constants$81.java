// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$81 {

    static final FunctionDescriptor glDrawElements$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDrawElements$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawElements",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$81.glDrawElements$FUNC, false
    );
    static final FunctionDescriptor glDrawPixels$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDrawPixels$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawPixels",
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$81.glDrawPixels$FUNC, false
    );
    static final FunctionDescriptor glDrawRangeElements$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDrawRangeElements$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawRangeElements",
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$81.glDrawRangeElements$FUNC, false
    );
    static final FunctionDescriptor glEdgeFlag$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR
    );
    static final MethodHandle glEdgeFlag$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEdgeFlag",
        "(B)V",
        constants$81.glEdgeFlag$FUNC, false
    );
    static final FunctionDescriptor glEdgeFlagPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glEdgeFlagPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEdgeFlagPointer",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$81.glEdgeFlagPointer$FUNC, false
    );
    static final FunctionDescriptor glEdgeFlagv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glEdgeFlagv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEdgeFlagv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$81.glEdgeFlagv$FUNC, false
    );
}


