// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1051 {

    static final FunctionDescriptor PFNGLVIEWPORTPOSITIONWSCALENVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle PFNGLVIEWPORTPOSITIONWSCALENVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1051.PFNGLVIEWPORTPOSITIONWSCALENVPROC$FUNC
    );
    static final FunctionDescriptor glViewportPositionWScaleNV$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glViewportPositionWScaleNV$MH = RuntimeHelper.downcallHandle(
        "glViewportPositionWScaleNV",
        constants$1051.glViewportPositionWScaleNV$FUNC
    );
    static final FunctionDescriptor PFNGLCREATESTATESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLCREATESTATESNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1051.PFNGLCREATESTATESNVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDELETESTATESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


