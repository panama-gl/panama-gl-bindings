// Generated by jextract

package jawt.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor fread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fread$MH = RuntimeHelper.downcallHandle(
        "fread",
        constants$3.fread$FUNC
    );
    static final FunctionDescriptor freopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle freopen$MH = RuntimeHelper.downcallHandle(
        "freopen",
        constants$3.freopen$FUNC
    );
    static final FunctionDescriptor fscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fscanf$MH = RuntimeHelper.downcallHandleVariadic(
        "fscanf",
        constants$3.fscanf$FUNC
    );
    static final FunctionDescriptor fseek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fseek$MH = RuntimeHelper.downcallHandle(
        "fseek",
        constants$3.fseek$FUNC
    );
    static final FunctionDescriptor fsetpos$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fsetpos$MH = RuntimeHelper.downcallHandle(
        "fsetpos",
        constants$3.fsetpos$FUNC
    );
    static final FunctionDescriptor ftell$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ftell$MH = RuntimeHelper.downcallHandle(
        "ftell",
        constants$3.ftell$FUNC
    );
}

