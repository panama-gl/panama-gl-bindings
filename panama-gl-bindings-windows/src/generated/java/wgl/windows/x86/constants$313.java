// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$313 {

    static final FunctionDescriptor IsBadWritePtr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IsBadWritePtr$MH = RuntimeHelper.downcallHandle(
        "IsBadWritePtr",
        constants$313.IsBadWritePtr$FUNC
    );
    static final FunctionDescriptor IsBadHugeReadPtr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IsBadHugeReadPtr$MH = RuntimeHelper.downcallHandle(
        "IsBadHugeReadPtr",
        constants$313.IsBadHugeReadPtr$FUNC
    );
    static final FunctionDescriptor IsBadHugeWritePtr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IsBadHugeWritePtr$MH = RuntimeHelper.downcallHandle(
        "IsBadHugeWritePtr",
        constants$313.IsBadHugeWritePtr$FUNC
    );
    static final FunctionDescriptor IsBadCodePtr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsBadCodePtr$MH = RuntimeHelper.downcallHandle(
        "IsBadCodePtr",
        constants$313.IsBadCodePtr$FUNC
    );
    static final FunctionDescriptor IsBadStringPtrA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IsBadStringPtrA$MH = RuntimeHelper.downcallHandle(
        "IsBadStringPtrA",
        constants$313.IsBadStringPtrA$FUNC
    );
    static final FunctionDescriptor IsBadStringPtrW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IsBadStringPtrW$MH = RuntimeHelper.downcallHandle(
        "IsBadStringPtrW",
        constants$313.IsBadStringPtrW$FUNC
    );
}

