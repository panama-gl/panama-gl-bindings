// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$472 {

    static final FunctionDescriptor PFNGLBEGINPERFMONITORAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLBEGINPERFMONITORAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$472.PFNGLBEGINPERFMONITORAMDPROC$FUNC
    );
    static final FunctionDescriptor PFNGLENDPERFMONITORAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLENDPERFMONITORAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$472.PFNGLENDPERFMONITORAMDPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETPERFMONITORCOUNTERDATAAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETPERFMONITORCOUNTERDATAAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$472.PFNGLGETPERFMONITORCOUNTERDATAAMDPROC$FUNC
    );
}


