// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1028 {

    static final FunctionDescriptor glXGetProcAddress$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glXGetProcAddress$MH = RuntimeHelper.downcallHandle(
        "glXGetProcAddress",
        constants$1028.glXGetProcAddress$FUNC
    );
    static final FunctionDescriptor PFNGLXGETPROCADDRESSPROC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLXGETPROCADDRESSPROC$MH = RuntimeHelper.downcallHandle(
        constants$1028.PFNGLXGETPROCADDRESSPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXCREATECONTEXTATTRIBSARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLXCREATECONTEXTATTRIBSARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$1028.PFNGLXCREATECONTEXTATTRIBSARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXGETGPUIDSAMDPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


