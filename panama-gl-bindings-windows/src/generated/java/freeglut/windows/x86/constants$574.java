// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$574 {

    static final FunctionDescriptor SetConsoleScreenBufferSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD")
    );
    static final MethodHandle SetConsoleScreenBufferSize$MH = RuntimeHelper.downcallHandle(
        "SetConsoleScreenBufferSize",
        constants$574.SetConsoleScreenBufferSize$FUNC
    );
    static final FunctionDescriptor SetConsoleCursorPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD")
    );
    static final MethodHandle SetConsoleCursorPosition$MH = RuntimeHelper.downcallHandle(
        "SetConsoleCursorPosition",
        constants$574.SetConsoleCursorPosition$FUNC
    );
    static final FunctionDescriptor GetLargestConsoleWindowSize$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("X"),
        Constants$root.C_SHORT$LAYOUT.withName("Y")
    ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLargestConsoleWindowSize$MH = RuntimeHelper.downcallHandle(
        "GetLargestConsoleWindowSize",
        constants$574.GetLargestConsoleWindowSize$FUNC
    );
    static final FunctionDescriptor SetConsoleTextAttribute$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle SetConsoleTextAttribute$MH = RuntimeHelper.downcallHandle(
        "SetConsoleTextAttribute",
        constants$574.SetConsoleTextAttribute$FUNC
    );
    static final FunctionDescriptor SetConsoleWindowInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleWindowInfo$MH = RuntimeHelper.downcallHandle(
        "SetConsoleWindowInfo",
        constants$574.SetConsoleWindowInfo$FUNC
    );
    static final FunctionDescriptor WriteConsoleOutputCharacterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteConsoleOutputCharacterA$MH = RuntimeHelper.downcallHandle(
        "WriteConsoleOutputCharacterA",
        constants$574.WriteConsoleOutputCharacterA$FUNC
    );
}

