// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$588 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM1DATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXSTREAM1DATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$588.PFNGLVERTEXSTREAM1DATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM1DVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM1DVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$588.PFNGLVERTEXSTREAM1DVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM2SATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXSTREAM2SATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ISS)V",
        constants$588.PFNGLVERTEXSTREAM2SATIPROC$FUNC, false
    );
}


