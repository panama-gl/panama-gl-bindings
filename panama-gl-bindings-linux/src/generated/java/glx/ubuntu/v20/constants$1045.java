// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1045 {

    static final FunctionDescriptor PFNGLXRELEASEVIDEOIMAGENVPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLXRELEASEVIDEOIMAGENVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1045.PFNGLXRELEASEVIDEOIMAGENVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXSENDPBUFFERTOVIDEONVPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle PFNGLXSENDPBUFFERTOVIDEONVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1045.PFNGLXSENDPBUFFERTOVIDEONVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXGETVIDEOINFONVPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLXGETVIDEOINFONVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1045.PFNGLXGETVIDEOINFONVPROC$FUNC
    );
    static final FunctionDescriptor imaxabs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle imaxabs$MH = RuntimeHelper.downcallHandle(
        "imaxabs",
        constants$1045.imaxabs$FUNC
    );
}


