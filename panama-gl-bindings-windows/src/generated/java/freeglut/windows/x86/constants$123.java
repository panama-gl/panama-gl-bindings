// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$123 {

    static final FunctionDescriptor WORKERCALLBACKFUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WORKERCALLBACKFUNC$MH = RuntimeHelper.downcallHandle(
        constants$123.WORKERCALLBACKFUNC$FUNC
    );
    static final FunctionDescriptor APC_CALLBACK_FUNCTION$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle APC_CALLBACK_FUNCTION$MH = RuntimeHelper.downcallHandle(
        constants$123.APC_CALLBACK_FUNCTION$FUNC
    );
    static final FunctionDescriptor WAITORTIMERCALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WAITORTIMERCALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$123.WAITORTIMERCALLBACK$FUNC
    );
    static final FunctionDescriptor PFLS_CALLBACK_FUNCTION$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}

