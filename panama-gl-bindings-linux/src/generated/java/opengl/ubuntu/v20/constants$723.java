// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$723 {

    static final FunctionDescriptor PFNGLLGPUCOPYIMAGESUBDATANVXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLLGPUCOPYIMAGESUBDATANVXPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIIIIIIII)V",
        constants$723.PFNGLLGPUCOPYIMAGESUBDATANVXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLGPUINTERLOCKNVXPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLLGPUINTERLOCKNVXPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$723.PFNGLLGPUINTERLOCKNVXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATEPROGRESSFENCENVXPROC$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle PFNGLCREATEPROGRESSFENCENVXPROC$MH = RuntimeHelper.downcallHandle(
        "()I",
        constants$723.PFNGLCREATEPROGRESSFENCENVXPROC$FUNC, false
    );
}


