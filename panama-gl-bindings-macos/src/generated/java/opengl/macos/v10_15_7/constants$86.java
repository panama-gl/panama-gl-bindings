// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$86 {

    static final FunctionDescriptor glFrustum$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glFrustum$MH = RuntimeHelper.downcallHandle(
        "glFrustum",
        constants$86.glFrustum$FUNC
    );
    static final FunctionDescriptor glGenLists$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGenLists$MH = RuntimeHelper.downcallHandle(
        "glGenLists",
        constants$86.glGenLists$FUNC
    );
    static final FunctionDescriptor glGenTextures$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenTextures$MH = RuntimeHelper.downcallHandle(
        "glGenTextures",
        constants$86.glGenTextures$FUNC
    );
    static final FunctionDescriptor glGetBooleanv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetBooleanv$MH = RuntimeHelper.downcallHandle(
        "glGetBooleanv",
        constants$86.glGetBooleanv$FUNC
    );
    static final FunctionDescriptor glGetClipPlane$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetClipPlane$MH = RuntimeHelper.downcallHandle(
        "glGetClipPlane",
        constants$86.glGetClipPlane$FUNC
    );
    static final FunctionDescriptor glGetColorTable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetColorTable$MH = RuntimeHelper.downcallHandle(
        "glGetColorTable",
        constants$86.glGetColorTable$FUNC
    );
}


