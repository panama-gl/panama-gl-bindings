// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$710 {

    static final FunctionDescriptor PFNGLGETPERFQUERYDATAINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPERFQUERYDATAINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$710.PFNGLGETPERFQUERYDATAINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPERFQUERYIDBYNAMEINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPERFQUERYIDBYNAMEINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$710.PFNGLGETPERFQUERYIDBYNAMEINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPERFQUERYINFOINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPERFQUERYINFOINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$710.PFNGLGETPERFQUERYINFOINTELPROC$FUNC, false
    );
}


