// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$432 {

    static final FunctionDescriptor RegisterClassExA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassExA$MH = RuntimeHelper.downcallHandle(
        "RegisterClassExA",
        constants$432.RegisterClassExA$FUNC
    );
    static final FunctionDescriptor RegisterClassExW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassExW$MH = RuntimeHelper.downcallHandle(
        "RegisterClassExW",
        constants$432.RegisterClassExW$FUNC
    );
    static final FunctionDescriptor GetClassInfoExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoExA$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoExA",
        constants$432.GetClassInfoExA$FUNC
    );
    static final FunctionDescriptor GetClassInfoExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoExW$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoExW",
        constants$432.GetClassInfoExW$FUNC
    );
    static final FunctionDescriptor PREGISTERCLASSNAMEW$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PREGISTERCLASSNAMEW$MH = RuntimeHelper.downcallHandle(
        constants$432.PREGISTERCLASSNAMEW$FUNC
    );
}

