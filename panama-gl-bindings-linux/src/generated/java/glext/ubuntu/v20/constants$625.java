// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$625 {

    static final FunctionDescriptor glVertex3xOES$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glVertex3xOES$MH = RuntimeHelper.downcallHandle(
        "glVertex3xOES",
        constants$625.glVertex3xOES$FUNC
    );
    static final FunctionDescriptor glVertex3xvOES$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glVertex3xvOES$MH = RuntimeHelper.downcallHandle(
        "glVertex3xvOES",
        constants$625.glVertex3xvOES$FUNC
    );
    static final FunctionDescriptor glVertex4xOES$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glVertex4xOES$MH = RuntimeHelper.downcallHandle(
        "glVertex4xOES",
        constants$625.glVertex4xOES$FUNC
    );
    static final FunctionDescriptor glVertex4xvOES$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glVertex4xvOES$MH = RuntimeHelper.downcallHandle(
        "glVertex4xvOES",
        constants$625.glVertex4xvOES$FUNC
    );
    static final FunctionDescriptor PFNGLQUERYMATRIXXOESPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLQUERYMATRIXXOESPROC$MH = RuntimeHelper.downcallHandle(
        constants$625.PFNGLQUERYMATRIXXOESPROC$FUNC
    );
}


