// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$563 {

    static final FunctionDescriptor PFNGLISFENCEAPPLEPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISFENCEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$563.PFNGLISFENCEAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTESTFENCEAPPLEPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLTESTFENCEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$563.PFNGLTESTFENCEAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFINISHFENCEAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLFINISHFENCEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$563.PFNGLFINISHFENCEAPPLEPROC$FUNC, false
    );
}

