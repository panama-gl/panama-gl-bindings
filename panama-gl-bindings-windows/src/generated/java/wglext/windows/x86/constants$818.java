// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$818 {

    static final FunctionDescriptor SetUserFileEncryptionKeyEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetUserFileEncryptionKeyEx$MH = RuntimeHelper.downcallHandle(
        "SetUserFileEncryptionKeyEx",
        constants$818.SetUserFileEncryptionKeyEx$FUNC
    );
    static final FunctionDescriptor FreeEncryptionCertificateHashList$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeEncryptionCertificateHashList$MH = RuntimeHelper.downcallHandle(
        "FreeEncryptionCertificateHashList",
        constants$818.FreeEncryptionCertificateHashList$FUNC
    );
    static final FunctionDescriptor EncryptionDisable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EncryptionDisable$MH = RuntimeHelper.downcallHandle(
        "EncryptionDisable",
        constants$818.EncryptionDisable$FUNC
    );
    static final FunctionDescriptor DuplicateEncryptionInfoFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DuplicateEncryptionInfoFile$MH = RuntimeHelper.downcallHandle(
        "DuplicateEncryptionInfoFile",
        constants$818.DuplicateEncryptionInfoFile$FUNC
    );
    static final FunctionDescriptor GetEncryptedFileMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "GetEncryptedFileMetadata",
        constants$818.GetEncryptedFileMetadata$FUNC
    );
    static final FunctionDescriptor SetEncryptedFileMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "SetEncryptedFileMetadata",
        constants$818.SetEncryptedFileMetadata$FUNC
    );
}


