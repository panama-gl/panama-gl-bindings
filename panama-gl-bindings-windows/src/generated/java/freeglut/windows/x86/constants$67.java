// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$67 {

    static final FunctionDescriptor ReadRaw8$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw8$MH = RuntimeHelper.downcallHandle(
        "ReadRaw8",
        constants$67.ReadRaw8$FUNC
    );
    static final FunctionDescriptor WriteRaw8$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteRaw8$MH = RuntimeHelper.downcallHandle(
        "WriteRaw8",
        constants$67.WriteRaw8$FUNC
    );
    static final FunctionDescriptor ReadRaw16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw16$MH = RuntimeHelper.downcallHandle(
        "ReadRaw16",
        constants$67.ReadRaw16$FUNC
    );
    static final FunctionDescriptor WriteRaw16$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle WriteRaw16$MH = RuntimeHelper.downcallHandle(
        "WriteRaw16",
        constants$67.WriteRaw16$FUNC
    );
    static final FunctionDescriptor ReadRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw$MH = RuntimeHelper.downcallHandle(
        "ReadRaw",
        constants$67.ReadRaw$FUNC
    );
    static final FunctionDescriptor WriteRaw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteRaw$MH = RuntimeHelper.downcallHandle(
        "WriteRaw",
        constants$67.WriteRaw$FUNC
    );
}

