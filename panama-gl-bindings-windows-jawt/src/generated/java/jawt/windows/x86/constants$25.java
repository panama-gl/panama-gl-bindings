// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$25 {

    static final FunctionDescriptor _fcloseall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _fcloseall$MH = RuntimeHelper.downcallHandle(
        "_fcloseall",
        constants$25._fcloseall$FUNC
    );
    static final FunctionDescriptor _fdopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fdopen$MH = RuntimeHelper.downcallHandle(
        "_fdopen",
        constants$25._fdopen$FUNC
    );
    static final FunctionDescriptor feof$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle feof$MH = RuntimeHelper.downcallHandle(
        "feof",
        constants$25.feof$FUNC
    );
    static final FunctionDescriptor ferror$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ferror$MH = RuntimeHelper.downcallHandle(
        "ferror",
        constants$25.ferror$FUNC
    );
    static final FunctionDescriptor fflush$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush$MH = RuntimeHelper.downcallHandle(
        "fflush",
        constants$25.fflush$FUNC
    );
    static final FunctionDescriptor fgetc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgetc$MH = RuntimeHelper.downcallHandle(
        "fgetc",
        constants$25.fgetc$FUNC
    );
}


