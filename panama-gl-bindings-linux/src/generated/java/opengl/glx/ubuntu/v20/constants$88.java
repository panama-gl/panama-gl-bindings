// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$88 {

    static final FunctionDescriptor glGetPolygonStipple$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glGetPolygonStipple$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetPolygonStipple",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$88.glGetPolygonStipple$FUNC, false
    );
    static final FunctionDescriptor glEdgeFlag$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR
    );
    static final MethodHandle glEdgeFlag$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glEdgeFlag",
        "(B)V",
        constants$88.glEdgeFlag$FUNC, false
    );
    static final FunctionDescriptor glEdgeFlagv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glEdgeFlagv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glEdgeFlagv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$88.glEdgeFlagv$FUNC, false
    );
    static final FunctionDescriptor glScissor$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glScissor$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glScissor",
        "(IIII)V",
        constants$88.glScissor$FUNC, false
    );
    static final FunctionDescriptor glClipPlane$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glClipPlane$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glClipPlane",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$88.glClipPlane$FUNC, false
    );
    static final FunctionDescriptor glGetClipPlane$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetClipPlane$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetClipPlane",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$88.glGetClipPlane$FUNC, false
    );
}


