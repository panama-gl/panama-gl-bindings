// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1101 {

    static final FunctionDescriptor CoGetInstanceFromIStorage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetInstanceFromIStorage$MH = RuntimeHelper.downcallHandle(
        "CoGetInstanceFromIStorage",
        constants$1101.CoGetInstanceFromIStorage$FUNC
    );
    static final FunctionDescriptor CoAllowSetForegroundWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoAllowSetForegroundWindow$MH = RuntimeHelper.downcallHandle(
        "CoAllowSetForegroundWindow",
        constants$1101.CoAllowSetForegroundWindow$FUNC
    );
    static final FunctionDescriptor DcomChannelSetHResult$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DcomChannelSetHResult$MH = RuntimeHelper.downcallHandle(
        "DcomChannelSetHResult",
        constants$1101.DcomChannelSetHResult$FUNC
    );
    static final FunctionDescriptor CoIsOle1Class$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoIsOle1Class$MH = RuntimeHelper.downcallHandle(
        "CoIsOle1Class",
        constants$1101.CoIsOle1Class$FUNC
    );
    static final FunctionDescriptor CoFileTimeToDosDateTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoFileTimeToDosDateTime$MH = RuntimeHelper.downcallHandle(
        "CoFileTimeToDosDateTime",
        constants$1101.CoFileTimeToDosDateTime$FUNC
    );
    static final FunctionDescriptor CoDosDateTimeToFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoDosDateTimeToFileTime$MH = RuntimeHelper.downcallHandle(
        "CoDosDateTimeToFileTime",
        constants$1101.CoDosDateTimeToFileTime$FUNC
    );
}


