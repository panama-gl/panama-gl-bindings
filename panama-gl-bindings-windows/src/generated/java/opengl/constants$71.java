// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$71 {

    static final FunctionDescriptor ReadULongAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadULongAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadULongAcquire",
        constants$71.ReadULongAcquire$FUNC
    );
    static final FunctionDescriptor ReadULongNoFence$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadULongNoFence$MH = RuntimeHelper.downcallHandle(
        "ReadULongNoFence",
        constants$71.ReadULongNoFence$FUNC
    );
    static final FunctionDescriptor ReadULongRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadULongRaw$MH = RuntimeHelper.downcallHandle(
        "ReadULongRaw",
        constants$71.ReadULongRaw$FUNC
    );
    static final FunctionDescriptor WriteULongRelease$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteULongRelease$MH = RuntimeHelper.downcallHandle(
        "WriteULongRelease",
        constants$71.WriteULongRelease$FUNC
    );
    static final FunctionDescriptor WriteULongNoFence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteULongNoFence$MH = RuntimeHelper.downcallHandle(
        "WriteULongNoFence",
        constants$71.WriteULongNoFence$FUNC
    );
    static final FunctionDescriptor WriteULongRaw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteULongRaw$MH = RuntimeHelper.downcallHandle(
        "WriteULongRaw",
        constants$71.WriteULongRaw$FUNC
    );
}


