// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$152 {

    static final FunctionDescriptor glMultiTexCoord2dv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2dv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2dv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$152.glMultiTexCoord2dv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMultiTexCoord2f$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2f",
        "(IFF)V",
        constants$152.glMultiTexCoord2f$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2fv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2fv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$152.glMultiTexCoord2fv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glMultiTexCoord2i$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2i",
        "(III)V",
        constants$152.glMultiTexCoord2i$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2iv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2iv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2iv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$152.glMultiTexCoord2iv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2s$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glMultiTexCoord2s$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2s",
        "(ISS)V",
        constants$152.glMultiTexCoord2s$FUNC, false
    );
}

