// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1280 {

    static final FunctionDescriptor PFNGLFOGFUNCSGISPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLFOGFUNCSGISPROC$MH = RuntimeHelper.downcallHandle(
        constants$1280.PFNGLFOGFUNCSGISPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETFOGFUNCSGISPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETFOGFUNCSGISPROC$MH = RuntimeHelper.downcallHandle(
        constants$1280.PFNGLGETFOGFUNCSGISPROC$FUNC
    );
    static final FunctionDescriptor glFogFuncSGIS$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glFogFuncSGIS$MH = RuntimeHelper.downcallHandle(
        "glFogFuncSGIS",
        constants$1280.glFogFuncSGIS$FUNC
    );
    static final FunctionDescriptor glGetFogFuncSGIS$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetFogFuncSGIS$MH = RuntimeHelper.downcallHandle(
        "glGetFogFuncSGIS",
        constants$1280.glGetFogFuncSGIS$FUNC
    );
    static final FunctionDescriptor PFNGLSAMPLEMASKSGISPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
}


