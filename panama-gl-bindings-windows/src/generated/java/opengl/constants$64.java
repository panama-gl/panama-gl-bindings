// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$64 {

    static final FunctionDescriptor PTERMINATION_HANDLER$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTERMINATION_HANDLER$MH = RuntimeHelper.downcallHandle(
        constants$64.PTERMINATION_HANDLER$FUNC
    );
    static final FunctionDescriptor __int2c$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle __int2c$MH = RuntimeHelper.downcallHandle(
        "__int2c",
        constants$64.__int2c$FUNC
    );
    static final FunctionDescriptor ReadAcquire8$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadAcquire8$MH = RuntimeHelper.downcallHandle(
        "ReadAcquire8",
        constants$64.ReadAcquire8$FUNC
    );
    static final FunctionDescriptor ReadNoFence8$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadNoFence8$MH = RuntimeHelper.downcallHandle(
        "ReadNoFence8",
        constants$64.ReadNoFence8$FUNC
    );
    static final FunctionDescriptor WriteRelease8$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteRelease8$MH = RuntimeHelper.downcallHandle(
        "WriteRelease8",
        constants$64.WriteRelease8$FUNC
    );
    static final FunctionDescriptor WriteNoFence8$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteNoFence8$MH = RuntimeHelper.downcallHandle(
        "WriteNoFence8",
        constants$64.WriteNoFence8$FUNC
    );
}


