// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$197 {

    static final FunctionDescriptor PFNGLGETBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        constants$197.PFNGLGETBUFFERSUBDATAPROC$FUNC
    );
    static final FunctionDescriptor PFNGLMAPBUFFERPROC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLMAPBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        constants$197.PFNGLMAPBUFFERPROC$FUNC
    );
    static final FunctionDescriptor PFNGLUNMAPBUFFERPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLUNMAPBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        constants$197.PFNGLUNMAPBUFFERPROC$FUNC
    );
}


