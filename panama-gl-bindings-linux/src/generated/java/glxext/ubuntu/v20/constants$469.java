// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$469 {

    static final FunctionDescriptor PFNGLMAPBUFFERARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLMAPBUFFERARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$469.PFNGLMAPBUFFERARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLUNMAPBUFFERARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLUNMAPBUFFERARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$469.PFNGLUNMAPBUFFERARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETBUFFERPARAMETERIVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETBUFFERPARAMETERIVARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$469.PFNGLGETBUFFERPARAMETERIVARBPROC$FUNC
    );
}


