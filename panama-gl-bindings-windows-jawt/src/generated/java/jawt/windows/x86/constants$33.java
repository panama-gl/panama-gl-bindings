// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor _lock_file$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _lock_file$MH = RuntimeHelper.downcallHandle(
        "_lock_file",
        constants$33._lock_file$FUNC
    );
    static final FunctionDescriptor _unlock_file$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _unlock_file$MH = RuntimeHelper.downcallHandle(
        "_unlock_file",
        constants$33._unlock_file$FUNC
    );
    static final FunctionDescriptor _fclose_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fclose_nolock$MH = RuntimeHelper.downcallHandle(
        "_fclose_nolock",
        constants$33._fclose_nolock$FUNC
    );
    static final FunctionDescriptor _fflush_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fflush_nolock$MH = RuntimeHelper.downcallHandle(
        "_fflush_nolock",
        constants$33._fflush_nolock$FUNC
    );
    static final FunctionDescriptor _fgetc_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fgetc_nolock$MH = RuntimeHelper.downcallHandle(
        "_fgetc_nolock",
        constants$33._fgetc_nolock$FUNC
    );
    static final FunctionDescriptor _fputc_nolock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fputc_nolock$MH = RuntimeHelper.downcallHandle(
        "_fputc_nolock",
        constants$33._fputc_nolock$FUNC
    );
}


