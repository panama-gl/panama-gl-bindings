// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$450 {

    static final FunctionDescriptor GetClipboardOwner$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetClipboardOwner$MH = RuntimeHelper.downcallHandle(
        "GetClipboardOwner",
        constants$450.GetClipboardOwner$FUNC
    );
    static final FunctionDescriptor SetClipboardViewer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetClipboardViewer$MH = RuntimeHelper.downcallHandle(
        "SetClipboardViewer",
        constants$450.SetClipboardViewer$FUNC
    );
    static final FunctionDescriptor GetClipboardViewer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetClipboardViewer$MH = RuntimeHelper.downcallHandle(
        "GetClipboardViewer",
        constants$450.GetClipboardViewer$FUNC
    );
    static final FunctionDescriptor ChangeClipboardChain$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChangeClipboardChain$MH = RuntimeHelper.downcallHandle(
        "ChangeClipboardChain",
        constants$450.ChangeClipboardChain$FUNC
    );
    static final FunctionDescriptor SetClipboardData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetClipboardData$MH = RuntimeHelper.downcallHandle(
        "SetClipboardData",
        constants$450.SetClipboardData$FUNC
    );
    static final FunctionDescriptor GetClipboardData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetClipboardData$MH = RuntimeHelper.downcallHandle(
        "GetClipboardData",
        constants$450.GetClipboardData$FUNC
    );
}


