// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$10 {

    static final FunctionDescriptor XGetFontPath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetFontPath$MH = RuntimeHelper.downcallHandle(
        "XGetFontPath",
        constants$10.XGetFontPath$FUNC
    );
    static final FunctionDescriptor XListExtensions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListExtensions$MH = RuntimeHelper.downcallHandle(
        "XListExtensions",
        constants$10.XListExtensions$FUNC
    );
    static final FunctionDescriptor XListProperties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListProperties$MH = RuntimeHelper.downcallHandle(
        "XListProperties",
        constants$10.XListProperties$FUNC
    );
    static final FunctionDescriptor XListHosts$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListHosts$MH = RuntimeHelper.downcallHandle(
        "XListHosts",
        constants$10.XListHosts$FUNC
    );
    static final FunctionDescriptor XKeycodeToKeysym$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XKeycodeToKeysym$MH = RuntimeHelper.downcallHandle(
        "XKeycodeToKeysym",
        constants$10.XKeycodeToKeysym$FUNC
    );
    static final FunctionDescriptor XLookupKeysym$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XLookupKeysym$MH = RuntimeHelper.downcallHandle(
        "XLookupKeysym",
        constants$10.XLookupKeysym$FUNC
    );
}


