// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$565 {

    static final FunctionDescriptor PHANDLER_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PHANDLER_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$565.PHANDLER_ROUTINE$FUNC
    );
    static final FunctionDescriptor SetConsoleCtrlHandler$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetConsoleCtrlHandler$MH = RuntimeHelper.downcallHandle(
        "SetConsoleCtrlHandler",
        constants$565.SetConsoleCtrlHandler$FUNC
    );
    static final FunctionDescriptor CreatePseudoConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePseudoConsole$MH = RuntimeHelper.downcallHandle(
        "CreatePseudoConsole",
        constants$565.CreatePseudoConsole$FUNC
    );
    static final FunctionDescriptor ResizePseudoConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD")
    );
    static final MethodHandle ResizePseudoConsole$MH = RuntimeHelper.downcallHandle(
        "ResizePseudoConsole",
        constants$565.ResizePseudoConsole$FUNC
    );
    static final FunctionDescriptor ClosePseudoConsole$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClosePseudoConsole$MH = RuntimeHelper.downcallHandle(
        "ClosePseudoConsole",
        constants$565.ClosePseudoConsole$FUNC
    );
}


