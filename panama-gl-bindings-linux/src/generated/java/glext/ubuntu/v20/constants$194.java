// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$194 {

    static final FunctionDescriptor PFNGLGENRENDERBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGENRENDERBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        constants$194.PFNGLGENRENDERBUFFERSPROC$FUNC
    );
    static final FunctionDescriptor PFNGLRENDERBUFFERSTORAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLRENDERBUFFERSTORAGEPROC$MH = RuntimeHelper.downcallHandle(
        constants$194.PFNGLRENDERBUFFERSTORAGEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETRENDERBUFFERPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETRENDERBUFFERPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        constants$194.PFNGLGETRENDERBUFFERPARAMETERIVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLISFRAMEBUFFERPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
}

