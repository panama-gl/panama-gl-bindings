// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$292 {

    static final FunctionDescriptor PFNGLUNIFORM2DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLUNIFORM2DPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$292.PFNGLUNIFORM2DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM3DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLUNIFORM3DPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDD)V",
        constants$292.PFNGLUNIFORM3DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM4DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLUNIFORM4DPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDDD)V",
        constants$292.PFNGLUNIFORM4DPROC$FUNC, false
    );
}

