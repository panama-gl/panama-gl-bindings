// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$5 {

    static final FunctionDescriptor _wperror$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wperror$MH = RuntimeHelper.downcallHandle(
        "_wperror",
        constants$5._wperror$FUNC
    );
    static final FunctionDescriptor _wpopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wpopen$MH = RuntimeHelper.downcallHandle(
        "_wpopen",
        constants$5._wpopen$FUNC
    );
    static final FunctionDescriptor _wremove$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wremove$MH = RuntimeHelper.downcallHandle(
        "_wremove",
        constants$5._wremove$FUNC
    );
    static final FunctionDescriptor _wtempnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wtempnam$MH = RuntimeHelper.downcallHandle(
        "_wtempnam",
        constants$5._wtempnam$FUNC
    );
    static final FunctionDescriptor _wtmpnam_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _wtmpnam_s$MH = RuntimeHelper.downcallHandle(
        "_wtmpnam_s",
        constants$5._wtmpnam_s$FUNC
    );
    static final FunctionDescriptor _wtmpnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wtmpnam$MH = RuntimeHelper.downcallHandle(
        "_wtmpnam",
        constants$5._wtmpnam$FUNC
    );
}


