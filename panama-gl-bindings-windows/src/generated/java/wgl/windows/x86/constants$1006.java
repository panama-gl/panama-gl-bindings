// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1006 {

    static final FunctionDescriptor IIDFromString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IIDFromString$MH = RuntimeHelper.downcallHandle(
        "IIDFromString",
        constants$1006.IIDFromString$FUNC
    );
    static final FunctionDescriptor ProgIDFromCLSID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ProgIDFromCLSID$MH = RuntimeHelper.downcallHandle(
        "ProgIDFromCLSID",
        constants$1006.ProgIDFromCLSID$FUNC
    );
    static final FunctionDescriptor CLSIDFromProgID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLSIDFromProgID$MH = RuntimeHelper.downcallHandle(
        "CLSIDFromProgID",
        constants$1006.CLSIDFromProgID$FUNC
    );
    static final FunctionDescriptor StringFromGUID2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle StringFromGUID2$MH = RuntimeHelper.downcallHandle(
        "StringFromGUID2",
        constants$1006.StringFromGUID2$FUNC
    );
    static final FunctionDescriptor CoCreateGuid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoCreateGuid$MH = RuntimeHelper.downcallHandle(
        "CoCreateGuid",
        constants$1006.CoCreateGuid$FUNC
    );
    static final FunctionDescriptor PropVariantCopy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PropVariantCopy$MH = RuntimeHelper.downcallHandle(
        "PropVariantCopy",
        constants$1006.PropVariantCopy$FUNC
    );
}


