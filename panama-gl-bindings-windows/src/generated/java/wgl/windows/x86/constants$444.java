// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$444 {

    static final FunctionDescriptor OpenClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenClipboard$MH = RuntimeHelper.downcallHandle(
        "OpenClipboard",
        constants$444.OpenClipboard$FUNC
    );
    static final FunctionDescriptor CloseClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CloseClipboard$MH = RuntimeHelper.downcallHandle(
        "CloseClipboard",
        constants$444.CloseClipboard$FUNC
    );
    static final FunctionDescriptor GetClipboardSequenceNumber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetClipboardSequenceNumber$MH = RuntimeHelper.downcallHandle(
        "GetClipboardSequenceNumber",
        constants$444.GetClipboardSequenceNumber$FUNC
    );
    static final FunctionDescriptor GetClipboardOwner$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetClipboardOwner$MH = RuntimeHelper.downcallHandle(
        "GetClipboardOwner",
        constants$444.GetClipboardOwner$FUNC
    );
    static final FunctionDescriptor SetClipboardViewer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetClipboardViewer$MH = RuntimeHelper.downcallHandle(
        "SetClipboardViewer",
        constants$444.SetClipboardViewer$FUNC
    );
    static final FunctionDescriptor GetClipboardViewer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetClipboardViewer$MH = RuntimeHelper.downcallHandle(
        "GetClipboardViewer",
        constants$444.GetClipboardViewer$FUNC
    );
}


