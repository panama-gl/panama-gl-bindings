// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$576 {

    static final FunctionDescriptor GetConsoleAliasExesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleAliasExesA$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasExesA",
        constants$576.GetConsoleAliasExesA$FUNC
    );
    static final FunctionDescriptor GetConsoleAliasExesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleAliasExesW$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasExesW",
        constants$576.GetConsoleAliasExesW$FUNC
    );
    static final FunctionDescriptor ExpungeConsoleCommandHistoryA$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExpungeConsoleCommandHistoryA$MH = RuntimeHelper.downcallHandle(
        "ExpungeConsoleCommandHistoryA",
        constants$576.ExpungeConsoleCommandHistoryA$FUNC
    );
    static final FunctionDescriptor ExpungeConsoleCommandHistoryW$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExpungeConsoleCommandHistoryW$MH = RuntimeHelper.downcallHandle(
        "ExpungeConsoleCommandHistoryW",
        constants$576.ExpungeConsoleCommandHistoryW$FUNC
    );
    static final FunctionDescriptor SetConsoleNumberOfCommandsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleNumberOfCommandsA$MH = RuntimeHelper.downcallHandle(
        "SetConsoleNumberOfCommandsA",
        constants$576.SetConsoleNumberOfCommandsA$FUNC
    );
    static final FunctionDescriptor SetConsoleNumberOfCommandsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleNumberOfCommandsW$MH = RuntimeHelper.downcallHandle(
        "SetConsoleNumberOfCommandsW",
        constants$576.SetConsoleNumberOfCommandsW$FUNC
    );
}

