// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$691 {

    static final FunctionDescriptor PFNGLALPHAFRAGMENTOP3ATIPROC$FUNC = FunctionDescriptor.ofVoid(
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
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLALPHAFRAGMENTOP3ATIPROC$MH = RuntimeHelper.downcallHandle(
        constants$691.PFNGLALPHAFRAGMENTOP3ATIPROC$FUNC
    );
    static final FunctionDescriptor PFNGLSETFRAGMENTSHADERCONSTANTATIPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLSETFRAGMENTSHADERCONSTANTATIPROC$MH = RuntimeHelper.downcallHandle(
        constants$691.PFNGLSETFRAGMENTSHADERCONSTANTATIPROC$FUNC
    );
    static final FunctionDescriptor glGenFragmentShadersATI$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGenFragmentShadersATI$MH = RuntimeHelper.downcallHandle(
        "glGenFragmentShadersATI",
        constants$691.glGenFragmentShadersATI$FUNC
    );
    static final FunctionDescriptor glBindFragmentShaderATI$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindFragmentShaderATI$MH = RuntimeHelper.downcallHandle(
        "glBindFragmentShaderATI",
        constants$691.glBindFragmentShaderATI$FUNC
    );
}


