// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$150 {

    static final FunctionDescriptor glCompressedTexSubImage2D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glCompressedTexSubImage2D$MH = RuntimeHelper.downcallHandle(
        "glCompressedTexSubImage2D",
        constants$150.glCompressedTexSubImage2D$FUNC
    );
    static final FunctionDescriptor glCompressedTexSubImage3D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glCompressedTexSubImage3D$MH = RuntimeHelper.downcallHandle(
        "glCompressedTexSubImage3D",
        constants$150.glCompressedTexSubImage3D$FUNC
    );
    static final FunctionDescriptor glGetCompressedTexImage$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetCompressedTexImage$MH = RuntimeHelper.downcallHandle(
        "glGetCompressedTexImage",
        constants$150.glGetCompressedTexImage$FUNC
    );
    static final FunctionDescriptor glMultiTexCoord1d$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glMultiTexCoord1d$MH = RuntimeHelper.downcallHandle(
        "glMultiTexCoord1d",
        constants$150.glMultiTexCoord1d$FUNC
    );
    static final FunctionDescriptor glMultiTexCoord1dv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glMultiTexCoord1dv$MH = RuntimeHelper.downcallHandle(
        "glMultiTexCoord1dv",
        constants$150.glMultiTexCoord1dv$FUNC
    );
    static final FunctionDescriptor glMultiTexCoord1f$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glMultiTexCoord1f$MH = RuntimeHelper.downcallHandle(
        "glMultiTexCoord1f",
        constants$150.glMultiTexCoord1f$FUNC
    );
}

