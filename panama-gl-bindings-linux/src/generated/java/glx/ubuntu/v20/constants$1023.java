// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1023 {

    static final FunctionDescriptor PFNGLXCREATEWINDOWPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLXCREATEWINDOWPROC$MH = RuntimeHelper.downcallHandle(
        constants$1023.PFNGLXCREATEWINDOWPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXDESTROYWINDOWPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLXDESTROYWINDOWPROC$MH = RuntimeHelper.downcallHandle(
        constants$1023.PFNGLXDESTROYWINDOWPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXCREATEPIXMAPPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLXCREATEPIXMAPPROC$MH = RuntimeHelper.downcallHandle(
        constants$1023.PFNGLXCREATEPIXMAPPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXDESTROYPIXMAPPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}


