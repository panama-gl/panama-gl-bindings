// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$280 {

    static final FunctionDescriptor SetMailslotInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMailslotInfo$MH = RuntimeHelper.downcallHandle(
        "SetMailslotInfo",
        constants$280.SetMailslotInfo$FUNC
    );
    static final FunctionDescriptor EncryptFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncryptFileA$MH = RuntimeHelper.downcallHandle(
        "EncryptFileA",
        constants$280.EncryptFileA$FUNC
    );
    static final FunctionDescriptor EncryptFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncryptFileW$MH = RuntimeHelper.downcallHandle(
        "EncryptFileW",
        constants$280.EncryptFileW$FUNC
    );
    static final FunctionDescriptor DecryptFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DecryptFileA$MH = RuntimeHelper.downcallHandle(
        "DecryptFileA",
        constants$280.DecryptFileA$FUNC
    );
    static final FunctionDescriptor DecryptFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DecryptFileW$MH = RuntimeHelper.downcallHandle(
        "DecryptFileW",
        constants$280.DecryptFileW$FUNC
    );
    static final FunctionDescriptor FileEncryptionStatusA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileEncryptionStatusA$MH = RuntimeHelper.downcallHandle(
        "FileEncryptionStatusA",
        constants$280.FileEncryptionStatusA$FUNC
    );
}


