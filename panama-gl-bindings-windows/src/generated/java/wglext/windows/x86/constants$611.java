// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$611 {

    static final FunctionDescriptor LZDone$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle LZDone$MH = RuntimeHelper.downcallHandle(
        "LZDone",
        constants$611.LZDone$FUNC
    );
    static final FunctionDescriptor CopyLZFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyLZFile$MH = RuntimeHelper.downcallHandle(
        "CopyLZFile",
        constants$611.CopyLZFile$FUNC
    );
    static final FunctionDescriptor LZCopy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LZCopy$MH = RuntimeHelper.downcallHandle(
        "LZCopy",
        constants$611.LZCopy$FUNC
    );
    static final FunctionDescriptor LZInit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LZInit$MH = RuntimeHelper.downcallHandle(
        "LZInit",
        constants$611.LZInit$FUNC
    );
    static final FunctionDescriptor GetExpandedNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetExpandedNameA$MH = RuntimeHelper.downcallHandle(
        "GetExpandedNameA",
        constants$611.GetExpandedNameA$FUNC
    );
    static final FunctionDescriptor GetExpandedNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetExpandedNameW$MH = RuntimeHelper.downcallHandle(
        "GetExpandedNameW",
        constants$611.GetExpandedNameW$FUNC
    );
}

