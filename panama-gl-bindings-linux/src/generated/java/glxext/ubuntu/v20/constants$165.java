// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$165 {

    static final FunctionDescriptor glMultiTexCoord4sARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle glMultiTexCoord4sARB$MH = RuntimeHelper.downcallHandle(
        "glMultiTexCoord4sARB",
        constants$165.glMultiTexCoord4sARB$FUNC
    );
    static final FunctionDescriptor glMultiTexCoord4svARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glMultiTexCoord4svARB$MH = RuntimeHelper.downcallHandle(
        "glMultiTexCoord4svARB",
        constants$165.glMultiTexCoord4svARB$FUNC
    );
    static final FunctionDescriptor PFNGLACTIVETEXTUREARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLACTIVETEXTUREARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$165.PFNGLACTIVETEXTUREARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLCLIENTACTIVETEXTUREARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLCLIENTACTIVETEXTUREARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$165.PFNGLCLIENTACTIVETEXTUREARBPROC$FUNC
    );
}


