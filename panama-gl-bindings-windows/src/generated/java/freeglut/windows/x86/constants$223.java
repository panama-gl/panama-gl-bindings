// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$223 {

    static final FunctionDescriptor CloseThreadpoolWait$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpoolWait$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpoolWait",
        constants$223.CloseThreadpoolWait$FUNC
    );
    static final FunctionDescriptor CreateThreadpoolIo$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThreadpoolIo$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpoolIo",
        constants$223.CreateThreadpoolIo$FUNC
    );
    static final FunctionDescriptor StartThreadpoolIo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartThreadpoolIo$MH = RuntimeHelper.downcallHandle(
        "StartThreadpoolIo",
        constants$223.StartThreadpoolIo$FUNC
    );
    static final FunctionDescriptor CancelThreadpoolIo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelThreadpoolIo$MH = RuntimeHelper.downcallHandle(
        "CancelThreadpoolIo",
        constants$223.CancelThreadpoolIo$FUNC
    );
    static final FunctionDescriptor WaitForThreadpoolIoCallbacks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForThreadpoolIoCallbacks$MH = RuntimeHelper.downcallHandle(
        "WaitForThreadpoolIoCallbacks",
        constants$223.WaitForThreadpoolIoCallbacks$FUNC
    );
    static final FunctionDescriptor CloseThreadpoolIo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpoolIo$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpoolIo",
        constants$223.CloseThreadpoolIo$FUNC
    );
}

