// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$597 {

    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$597.PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$597.PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENERATETEXTUREMIPMAPEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGENERATETEXTUREMIPMAPEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$597.PFNGLGENERATETEXTUREMIPMAPEXTPROC$FUNC, false
    );
}


