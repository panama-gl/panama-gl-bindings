// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$168 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD1SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle PFNGLMULTITEXCOORD1SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IS)V",
        constants$168.PFNGLMULTITEXCOORD1SARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD1SVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD1SVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$168.PFNGLMULTITEXCOORD1SVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLMULTITEXCOORD2DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$168.PFNGLMULTITEXCOORD2DARBPROC$FUNC, false
    );
}


