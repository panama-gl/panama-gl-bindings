// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1318 {

    static final FunctionDescriptor glLineStipple$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle glLineStipple$MH = RuntimeHelper.downcallHandle(
        "glLineStipple",
        constants$1318.glLineStipple$FUNC
    );
    static final FunctionDescriptor glLineWidth$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glLineWidth$MH = RuntimeHelper.downcallHandle(
        "glLineWidth",
        constants$1318.glLineWidth$FUNC
    );
    static final FunctionDescriptor glListBase$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glListBase$MH = RuntimeHelper.downcallHandle(
        "glListBase",
        constants$1318.glListBase$FUNC
    );
    static final FunctionDescriptor glLoadIdentity$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glLoadIdentity$MH = RuntimeHelper.downcallHandle(
        "glLoadIdentity",
        constants$1318.glLoadIdentity$FUNC
    );
    static final FunctionDescriptor glLoadMatrixd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glLoadMatrixd$MH = RuntimeHelper.downcallHandle(
        "glLoadMatrixd",
        constants$1318.glLoadMatrixd$FUNC
    );
    static final FunctionDescriptor glLoadMatrixf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glLoadMatrixf$MH = RuntimeHelper.downcallHandle(
        "glLoadMatrixf",
        constants$1318.glLoadMatrixf$FUNC
    );
}

