// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$227 {

    static final FunctionDescriptor PFNGLTEXIMAGE3DMULTISAMPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle PFNGLTEXIMAGE3DMULTISAMPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$227.PFNGLTEXIMAGE3DMULTISAMPLEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETMULTISAMPLEFVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETMULTISAMPLEFVPROC$MH = RuntimeHelper.downcallHandle(
        constants$227.PFNGLGETMULTISAMPLEFVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLSAMPLEMASKIPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLSAMPLEMASKIPROC$MH = RuntimeHelper.downcallHandle(
        constants$227.PFNGLSAMPLEMASKIPROC$FUNC
    );
    static final FunctionDescriptor glDrawElementsBaseVertex$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawElementsBaseVertex$MH = RuntimeHelper.downcallHandle(
        "glDrawElementsBaseVertex",
        constants$227.glDrawElementsBaseVertex$FUNC
    );
}


