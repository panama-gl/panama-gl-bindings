// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$668 {

    static final FunctionDescriptor UuidToStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UuidToStringA$MH = RuntimeHelper.downcallHandle(
        "UuidToStringA",
        constants$668.UuidToStringA$FUNC
    );
    static final FunctionDescriptor UuidFromStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UuidFromStringA$MH = RuntimeHelper.downcallHandle(
        "UuidFromStringA",
        constants$668.UuidFromStringA$FUNC
    );
    static final FunctionDescriptor UuidToStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UuidToStringW$MH = RuntimeHelper.downcallHandle(
        "UuidToStringW",
        constants$668.UuidToStringW$FUNC
    );
    static final FunctionDescriptor UuidFromStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UuidFromStringW$MH = RuntimeHelper.downcallHandle(
        "UuidFromStringW",
        constants$668.UuidFromStringW$FUNC
    );
    static final FunctionDescriptor UuidCompare$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UuidCompare$MH = RuntimeHelper.downcallHandle(
        "UuidCompare",
        constants$668.UuidCompare$FUNC
    );
    static final FunctionDescriptor UuidCreateNil$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UuidCreateNil$MH = RuntimeHelper.downcallHandle(
        "UuidCreateNil",
        constants$668.UuidCreateNil$FUNC
    );
}


