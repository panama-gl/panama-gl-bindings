// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$852 {

    static final FunctionDescriptor PFNGLGETPROGRAMIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$852.PFNGLGETPROGRAMIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPROGRAMSTRINGNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMSTRINGNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$852.PFNGLGETPROGRAMSTRINGNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETTRACKMATRIXIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTRACKMATRIXIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$852.PFNGLGETTRACKMATRIXIVNVPROC$FUNC, false
    );
}

