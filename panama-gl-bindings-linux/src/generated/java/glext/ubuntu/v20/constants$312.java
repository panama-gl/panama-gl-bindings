// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$312 {

    static final FunctionDescriptor PFNGLGETDOUBLEI_VPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETDOUBLEI_VPROC$MH = RuntimeHelper.downcallHandle(
        constants$312.PFNGLGETDOUBLEI_VPROC$FUNC
    );
    static final FunctionDescriptor glReleaseShaderCompiler$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glReleaseShaderCompiler$MH = RuntimeHelper.downcallHandle(
        "glReleaseShaderCompiler",
        constants$312.glReleaseShaderCompiler$FUNC
    );
    static final FunctionDescriptor glShaderBinary$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glShaderBinary$MH = RuntimeHelper.downcallHandle(
        "glShaderBinary",
        constants$312.glShaderBinary$FUNC
    );
    static final FunctionDescriptor glGetShaderPrecisionFormat$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetShaderPrecisionFormat$MH = RuntimeHelper.downcallHandle(
        "glGetShaderPrecisionFormat",
        constants$312.glGetShaderPrecisionFormat$FUNC
    );
    static final FunctionDescriptor glDepthRangef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glDepthRangef$MH = RuntimeHelper.downcallHandle(
        "glDepthRangef",
        constants$312.glDepthRangef$FUNC
    );
}


