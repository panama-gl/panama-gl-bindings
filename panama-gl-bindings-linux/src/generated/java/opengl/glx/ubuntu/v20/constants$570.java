// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$570 {

    static final FunctionDescriptor PFNGLISVERTEXATTRIBENABLEDAPPLEPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLISVERTEXATTRIBENABLEDAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(II)B",
        constants$570.PFNGLISVERTEXATTRIBENABLEDAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPVERTEXATTRIB1DAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPVERTEXATTRIB1DAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIDDIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$570.PFNGLMAPVERTEXATTRIB1DAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPVERTEXATTRIB1FAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPVERTEXATTRIB1FAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIFFIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$570.PFNGLMAPVERTEXATTRIB1FAPPLEPROC$FUNC, false
    );
}

