// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$999 {

    static final FunctionDescriptor PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$999.PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLRELEASEKEYEDMUTEXWIN32EXTPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLRELEASEKEYEDMUTEXWIN32EXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$999.PFNGLRELEASEKEYEDMUTEXWIN32EXTPROC$FUNC
    );
    static final FunctionDescriptor glAcquireKeyedMutexWin32EXT$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glAcquireKeyedMutexWin32EXT$MH = RuntimeHelper.downcallHandle(
        "glAcquireKeyedMutexWin32EXT",
        constants$999.glAcquireKeyedMutexWin32EXT$FUNC
    );
    static final FunctionDescriptor glReleaseKeyedMutexWin32EXT$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle glReleaseKeyedMutexWin32EXT$MH = RuntimeHelper.downcallHandle(
        "glReleaseKeyedMutexWin32EXT",
        constants$999.glReleaseKeyedMutexWin32EXT$FUNC
    );
}


