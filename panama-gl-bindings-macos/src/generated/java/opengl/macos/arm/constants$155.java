// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$155 {

    static final FunctionDescriptor glDeleteShader$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDeleteShader$MH = RuntimeHelper.downcallHandle(
        "glDeleteShader",
        constants$155.glDeleteShader$FUNC
    );
    static final FunctionDescriptor glDetachShader$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDetachShader$MH = RuntimeHelper.downcallHandle(
        "glDetachShader",
        constants$155.glDetachShader$FUNC
    );
    static final FunctionDescriptor glCreateShader$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCreateShader$MH = RuntimeHelper.downcallHandle(
        "glCreateShader",
        constants$155.glCreateShader$FUNC
    );
    static final FunctionDescriptor glShaderSource$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glShaderSource$MH = RuntimeHelper.downcallHandle(
        "glShaderSource",
        constants$155.glShaderSource$FUNC
    );
    static final FunctionDescriptor glCompileShader$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCompileShader$MH = RuntimeHelper.downcallHandle(
        "glCompileShader",
        constants$155.glCompileShader$FUNC
    );
    static final FunctionDescriptor glCreateProgram$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle glCreateProgram$MH = RuntimeHelper.downcallHandle(
        "glCreateProgram",
        constants$155.glCreateProgram$FUNC
    );
}


