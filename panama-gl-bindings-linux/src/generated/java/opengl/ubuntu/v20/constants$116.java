// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$116 {

    static final FunctionDescriptor PFNGLCREATEPROGRAMPROC$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle PFNGLCREATEPROGRAMPROC$MH = RuntimeHelper.downcallHandle(
        "()I",
        constants$116.PFNGLCREATEPROGRAMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATESHADERPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCREATESHADERPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$116.PFNGLCREATESHADERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEPROGRAMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLDELETEPROGRAMPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$116.PFNGLDELETEPROGRAMPROC$FUNC, false
    );
}


