// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$5 {

    static final FunctionDescriptor XFetchBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XFetchBuffer$MH = RuntimeHelper.downcallHandle(
        "XFetchBuffer",
        constants$5.XFetchBuffer$FUNC
    );
    static final FunctionDescriptor XGetAtomName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGetAtomName$MH = RuntimeHelper.downcallHandle(
        "XGetAtomName",
        constants$5.XGetAtomName$FUNC
    );
    static final FunctionDescriptor XGetAtomNames$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetAtomNames$MH = RuntimeHelper.downcallHandle(
        "XGetAtomNames",
        constants$5.XGetAtomNames$FUNC
    );
    static final FunctionDescriptor XGetDefault$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetDefault$MH = RuntimeHelper.downcallHandle(
        "XGetDefault",
        constants$5.XGetDefault$FUNC
    );
    static final FunctionDescriptor XDisplayName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XDisplayName$MH = RuntimeHelper.downcallHandle(
        "XDisplayName",
        constants$5.XDisplayName$FUNC
    );
    static final FunctionDescriptor XKeysymToString$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XKeysymToString$MH = RuntimeHelper.downcallHandle(
        "XKeysymToString",
        constants$5.XKeysymToString$FUNC
    );
}

