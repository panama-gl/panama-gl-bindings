// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1020 {

    static final FunctionDescriptor PFNGLFRAMEBUFFERPARAMETERIMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLFRAMEBUFFERPARAMETERIMESAPROC$MH = RuntimeHelper.downcallHandle(
        constants$1020.PFNGLFRAMEBUFFERPARAMETERIMESAPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETFRAMEBUFFERPARAMETERIVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETFRAMEBUFFERPARAMETERIVMESAPROC$MH = RuntimeHelper.downcallHandle(
        constants$1020.PFNGLGETFRAMEBUFFERPARAMETERIVMESAPROC$FUNC
    );
    static final FunctionDescriptor glFramebufferParameteriMESA$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFramebufferParameteriMESA$MH = RuntimeHelper.downcallHandle(
        "glFramebufferParameteriMESA",
        constants$1020.glFramebufferParameteriMESA$FUNC
    );
    static final FunctionDescriptor glGetFramebufferParameterivMESA$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetFramebufferParameterivMESA$MH = RuntimeHelper.downcallHandle(
        "glGetFramebufferParameterivMESA",
        constants$1020.glGetFramebufferParameterivMESA$FUNC
    );
}


