// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1251 {

    static final FunctionDescriptor OleGetClipboardWithEnterpriseInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleGetClipboardWithEnterpriseInfo$MH = RuntimeHelper.downcallHandle(
        "OleGetClipboardWithEnterpriseInfo",
        constants$1251.OleGetClipboardWithEnterpriseInfo$FUNC
    );
    static final FunctionDescriptor OleFlushClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle OleFlushClipboard$MH = RuntimeHelper.downcallHandle(
        "OleFlushClipboard",
        constants$1251.OleFlushClipboard$FUNC
    );
    static final FunctionDescriptor OleIsCurrentClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleIsCurrentClipboard$MH = RuntimeHelper.downcallHandle(
        "OleIsCurrentClipboard",
        constants$1251.OleIsCurrentClipboard$FUNC
    );
    static final FunctionDescriptor OleCreateMenuDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleCreateMenuDescriptor$MH = RuntimeHelper.downcallHandle(
        "OleCreateMenuDescriptor",
        constants$1251.OleCreateMenuDescriptor$FUNC
    );
    static final FunctionDescriptor OleSetMenuDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleSetMenuDescriptor$MH = RuntimeHelper.downcallHandle(
        "OleSetMenuDescriptor",
        constants$1251.OleSetMenuDescriptor$FUNC
    );
    static final FunctionDescriptor OleDestroyMenuDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleDestroyMenuDescriptor$MH = RuntimeHelper.downcallHandle(
        "OleDestroyMenuDescriptor",
        constants$1251.OleDestroyMenuDescriptor$FUNC
    );
}


