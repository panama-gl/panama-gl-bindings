// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1372 {

    static final FunctionDescriptor glutPassiveMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutPassiveMotionFunc$MH = RuntimeHelper.downcallHandle(
        "glutPassiveMotionFunc",
        constants$1372.glutPassiveMotionFunc$FUNC
    );
    static final FunctionDescriptor glutEntryFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutEntryFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$1372.glutEntryFunc$callback$FUNC
    );
    static final FunctionDescriptor glutEntryFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutEntryFunc$MH = RuntimeHelper.downcallHandle(
        "glutEntryFunc",
        constants$1372.glutEntryFunc$FUNC
    );
    static final FunctionDescriptor glutKeyboardUpFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutKeyboardUpFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$1372.glutKeyboardUpFunc$callback$FUNC
    );
}

