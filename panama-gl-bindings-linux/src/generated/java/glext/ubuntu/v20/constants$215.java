// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$215 {

    static final FunctionDescriptor glDeleteVertexArrays$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteVertexArrays$MH = RuntimeHelper.downcallHandle(
        "glDeleteVertexArrays",
        constants$215.glDeleteVertexArrays$FUNC
    );
    static final FunctionDescriptor glGenVertexArrays$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenVertexArrays$MH = RuntimeHelper.downcallHandle(
        "glGenVertexArrays",
        constants$215.glGenVertexArrays$FUNC
    );
    static final FunctionDescriptor glIsVertexArray$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsVertexArray$MH = RuntimeHelper.downcallHandle(
        "glIsVertexArray",
        constants$215.glIsVertexArray$FUNC
    );
    static final FunctionDescriptor PFNGLDRAWARRAYSINSTANCEDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLDRAWARRAYSINSTANCEDPROC$MH = RuntimeHelper.downcallHandle(
        constants$215.PFNGLDRAWARRAYSINSTANCEDPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDRAWELEMENTSINSTANCEDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
}

