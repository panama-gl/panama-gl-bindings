// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$276 {

    static final FunctionDescriptor PFE_IMPORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFE_IMPORT_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$276.PFE_IMPORT_FUNC$FUNC
    );
    static final FunctionDescriptor OpenEncryptedFileRawA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEncryptedFileRawA$MH = RuntimeHelper.downcallHandle(
        "OpenEncryptedFileRawA",
        constants$276.OpenEncryptedFileRawA$FUNC
    );
    static final FunctionDescriptor OpenEncryptedFileRawW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEncryptedFileRawW$MH = RuntimeHelper.downcallHandle(
        "OpenEncryptedFileRawW",
        constants$276.OpenEncryptedFileRawW$FUNC
    );
    static final FunctionDescriptor ReadEncryptedFileRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadEncryptedFileRaw$MH = RuntimeHelper.downcallHandle(
        "ReadEncryptedFileRaw",
        constants$276.ReadEncryptedFileRaw$FUNC
    );
    static final FunctionDescriptor WriteEncryptedFileRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteEncryptedFileRaw$MH = RuntimeHelper.downcallHandle(
        "WriteEncryptedFileRaw",
        constants$276.WriteEncryptedFileRaw$FUNC
    );
    static final FunctionDescriptor CloseEncryptedFileRaw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseEncryptedFileRaw$MH = RuntimeHelper.downcallHandle(
        "CloseEncryptedFileRaw",
        constants$276.CloseEncryptedFileRaw$FUNC
    );
}


