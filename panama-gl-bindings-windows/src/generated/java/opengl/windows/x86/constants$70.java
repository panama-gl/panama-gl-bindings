// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$70 {

    static final FunctionDescriptor ReadUShortAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUShortAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadUShortAcquire",
        constants$70.ReadUShortAcquire$FUNC
    );
    static final FunctionDescriptor ReadUShortNoFence$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUShortNoFence$MH = RuntimeHelper.downcallHandle(
        "ReadUShortNoFence",
        constants$70.ReadUShortNoFence$FUNC
    );
    static final FunctionDescriptor ReadUShortRaw$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUShortRaw$MH = RuntimeHelper.downcallHandle(
        "ReadUShortRaw",
        constants$70.ReadUShortRaw$FUNC
    );
    static final FunctionDescriptor WriteUShortRelease$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle WriteUShortRelease$MH = RuntimeHelper.downcallHandle(
        "WriteUShortRelease",
        constants$70.WriteUShortRelease$FUNC
    );
    static final FunctionDescriptor WriteUShortNoFence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle WriteUShortNoFence$MH = RuntimeHelper.downcallHandle(
        "WriteUShortNoFence",
        constants$70.WriteUShortNoFence$FUNC
    );
    static final FunctionDescriptor WriteUShortRaw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle WriteUShortRaw$MH = RuntimeHelper.downcallHandle(
        "WriteUShortRaw",
        constants$70.WriteUShortRaw$FUNC
    );
}


