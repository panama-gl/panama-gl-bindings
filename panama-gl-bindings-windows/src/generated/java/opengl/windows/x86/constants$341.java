// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$341 {

    static final FunctionDescriptor ApplicationRecoveryFinished$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ApplicationRecoveryFinished$MH = RuntimeHelper.downcallHandle(
        "ApplicationRecoveryFinished",
        constants$341.ApplicationRecoveryFinished$FUNC
    );
    static final FunctionDescriptor GetFileInformationByHandleEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetFileInformationByHandleEx$MH = RuntimeHelper.downcallHandle(
        "GetFileInformationByHandleEx",
        constants$341.GetFileInformationByHandleEx$FUNC
    );
    static final FunctionDescriptor OpenFileById$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenFileById$MH = RuntimeHelper.downcallHandle(
        "OpenFileById",
        constants$341.OpenFileById$FUNC
    );
    static final FunctionDescriptor CreateSymbolicLinkA$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSymbolicLinkA$MH = RuntimeHelper.downcallHandle(
        "CreateSymbolicLinkA",
        constants$341.CreateSymbolicLinkA$FUNC
    );
    static final FunctionDescriptor CreateSymbolicLinkW$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSymbolicLinkW$MH = RuntimeHelper.downcallHandle(
        "CreateSymbolicLinkW",
        constants$341.CreateSymbolicLinkW$FUNC
    );
    static final FunctionDescriptor QueryActCtxSettingsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryActCtxSettingsW$MH = RuntimeHelper.downcallHandle(
        "QueryActCtxSettingsW",
        constants$341.QueryActCtxSettingsW$FUNC
    );
}


