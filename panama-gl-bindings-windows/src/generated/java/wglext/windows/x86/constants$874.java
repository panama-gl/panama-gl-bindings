// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$874 {

    static final FunctionDescriptor DeviceDsmValidateOutput$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmValidateOutput$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmValidateOutput",
        constants$874.DeviceDsmValidateOutput$FUNC
    );
    static final  GroupLayout FILE_TYPE_NOTIFICATION_GUID_PAGE_FILE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FILE_TYPE_NOTIFICATION_GUID_PAGE_FILE$SEGMENT = RuntimeHelper.lookupGlobalVariable("FILE_TYPE_NOTIFICATION_GUID_PAGE_FILE", constants$874.FILE_TYPE_NOTIFICATION_GUID_PAGE_FILE$LAYOUT);
    static final  GroupLayout FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE$SEGMENT = RuntimeHelper.lookupGlobalVariable("FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE", constants$874.FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE$LAYOUT);
    static final  GroupLayout FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE$SEGMENT = RuntimeHelper.lookupGlobalVariable("FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE", constants$874.FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE$LAYOUT);
    static final FunctionDescriptor PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$874.PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK$FUNC
    );
}


