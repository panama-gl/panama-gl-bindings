// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1340 {

    static final FunctionDescriptor glTexCoord4iv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexCoord4iv$MH = RuntimeHelper.downcallHandle(
        "glTexCoord4iv",
        constants$1340.glTexCoord4iv$FUNC
    );
    static final FunctionDescriptor glTexCoord4s$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle glTexCoord4s$MH = RuntimeHelper.downcallHandle(
        "glTexCoord4s",
        constants$1340.glTexCoord4s$FUNC
    );
    static final FunctionDescriptor glTexCoord4sv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexCoord4sv$MH = RuntimeHelper.downcallHandle(
        "glTexCoord4sv",
        constants$1340.glTexCoord4sv$FUNC
    );
    static final FunctionDescriptor glTexCoordPointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexCoordPointer$MH = RuntimeHelper.downcallHandle(
        "glTexCoordPointer",
        constants$1340.glTexCoordPointer$FUNC
    );
    static final FunctionDescriptor glTexEnvf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glTexEnvf$MH = RuntimeHelper.downcallHandle(
        "glTexEnvf",
        constants$1340.glTexEnvf$FUNC
    );
    static final FunctionDescriptor glTexEnvfv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexEnvfv$MH = RuntimeHelper.downcallHandle(
        "glTexEnvfv",
        constants$1340.glTexEnvfv$FUNC
    );
}


