// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$96 {

    static final FunctionDescriptor glInterleavedArrays$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glInterleavedArrays$MH = RuntimeHelper.downcallHandle(
        "glInterleavedArrays",
        constants$96.glInterleavedArrays$FUNC
    );
    static final FunctionDescriptor glIsEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsEnabled$MH = RuntimeHelper.downcallHandle(
        "glIsEnabled",
        constants$96.glIsEnabled$FUNC
    );
    static final FunctionDescriptor glIsList$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsList$MH = RuntimeHelper.downcallHandle(
        "glIsList",
        constants$96.glIsList$FUNC
    );
    static final FunctionDescriptor glIsTexture$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsTexture$MH = RuntimeHelper.downcallHandle(
        "glIsTexture",
        constants$96.glIsTexture$FUNC
    );
    static final FunctionDescriptor glLightModelf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glLightModelf$MH = RuntimeHelper.downcallHandle(
        "glLightModelf",
        constants$96.glLightModelf$FUNC
    );
    static final FunctionDescriptor glLightModelfv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glLightModelfv$MH = RuntimeHelper.downcallHandle(
        "glLightModelfv",
        constants$96.glLightModelfv$FUNC
    );
}


