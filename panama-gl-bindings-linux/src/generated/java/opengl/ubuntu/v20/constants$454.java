// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$454 {

    static final FunctionDescriptor PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$454.PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$454.PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$454.PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$FUNC, false
    );
}


