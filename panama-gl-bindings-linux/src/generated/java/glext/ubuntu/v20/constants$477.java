// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$477 {

    static final FunctionDescriptor PFNGLDELETEFENCESAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDELETEFENCESAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$477.PFNGLDELETEFENCESAPPLEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLSETFENCEAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLSETFENCEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$477.PFNGLSETFENCEAPPLEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLISFENCEAPPLEPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISFENCEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$477.PFNGLISFENCEAPPLEPROC$FUNC
    );
}


