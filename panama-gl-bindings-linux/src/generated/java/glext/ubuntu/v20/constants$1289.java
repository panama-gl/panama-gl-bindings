// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1289 {

    static final FunctionDescriptor glGetTexFilterFuncSGIS$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetTexFilterFuncSGIS$MH = RuntimeHelper.downcallHandle(
        "glGetTexFilterFuncSGIS",
        constants$1289.glGetTexFilterFuncSGIS$FUNC
    );
    static final FunctionDescriptor glTexFilterFuncSGIS$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexFilterFuncSGIS$MH = RuntimeHelper.downcallHandle(
        "glTexFilterFuncSGIS",
        constants$1289.glTexFilterFuncSGIS$FUNC
    );
    static final FunctionDescriptor PFNGLASYNCMARKERSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLASYNCMARKERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        constants$1289.PFNGLASYNCMARKERSGIXPROC$FUNC
    );
    static final FunctionDescriptor PFNGLFINISHASYNCSGIXPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLFINISHASYNCSGIXPROC$MH = RuntimeHelper.downcallHandle(
        constants$1289.PFNGLFINISHASYNCSGIXPROC$FUNC
    );
}


