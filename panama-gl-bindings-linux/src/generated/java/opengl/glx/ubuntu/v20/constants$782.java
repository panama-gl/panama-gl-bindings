// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$782 {

    static final FunctionDescriptor PFNGLVERTEXWEIGHTPOINTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXWEIGHTPOINTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$782.PFNGLVERTEXWEIGHTPOINTEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IJI)B",
        constants$782.PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLRELEASEKEYEDMUTEXWIN32EXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLRELEASEKEYEDMUTEXWIN32EXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IJ)B",
        constants$782.PFNGLRELEASEKEYEDMUTEXWIN32EXTPROC$FUNC, false
    );
}


