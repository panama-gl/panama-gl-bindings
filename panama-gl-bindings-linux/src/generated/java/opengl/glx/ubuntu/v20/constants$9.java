// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$9 {

    static final FunctionDescriptor XCreateSimpleWindow$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle XCreateSimpleWindow$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreateSimpleWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;JIIIIIJJ)J",
        constants$9.XCreateSimpleWindow$FUNC, false
    );
    static final FunctionDescriptor XGetSelectionOwner$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle XGetSelectionOwner$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetSelectionOwner",
        "(Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$9.XGetSelectionOwner$FUNC, false
    );
    static final FunctionDescriptor XCreateWindow$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XCreateWindow$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreateWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;JIIIIIIILjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)J",
        constants$9.XCreateWindow$FUNC, false
    );
    static final FunctionDescriptor XListInstalledColormaps$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XListInstalledColormaps$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XListInstalledColormaps",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$9.XListInstalledColormaps$FUNC, false
    );
    static final FunctionDescriptor XListFonts$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle XListFonts$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XListFonts",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$9.XListFonts$FUNC, false
    );
    static final FunctionDescriptor XListFontsWithInfo$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XListFontsWithInfo$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XListFontsWithInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$9.XListFontsWithInfo$FUNC, false
    );
}

