// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$945 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB1SVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB1SVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$945.PFNGLVERTEXATTRIB1SVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2DNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB2DNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$945.PFNGLVERTEXATTRIB2DNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2DVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB2DVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$945.PFNGLVERTEXATTRIB2DVNVPROC$FUNC, false
    );
}

