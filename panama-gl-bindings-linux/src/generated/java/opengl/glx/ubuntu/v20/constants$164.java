// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$164 {

    static final FunctionDescriptor glMultiTexCoord4dARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glMultiTexCoord4dARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord4dARB",
        "(IDDDD)V",
        constants$164.glMultiTexCoord4dARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4dvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord4dvARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord4dvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$164.glMultiTexCoord4dvARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4fARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMultiTexCoord4fARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord4fARB",
        "(IFFFF)V",
        constants$164.glMultiTexCoord4fARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord4fvARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord4fvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$164.glMultiTexCoord4fvARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4iARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glMultiTexCoord4iARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord4iARB",
        "(IIIII)V",
        constants$164.glMultiTexCoord4iARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4ivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord4ivARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord4ivARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$164.glMultiTexCoord4ivARB$FUNC, false
    );
}


