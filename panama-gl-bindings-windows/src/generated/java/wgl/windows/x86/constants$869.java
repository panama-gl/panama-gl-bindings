// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$869 {

    static final  GroupLayout GUID_DEVINTERFACE_TAPE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_TAPE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_TAPE", constants$869.GUID_DEVINTERFACE_TAPE$LAYOUT);
    static final  GroupLayout GUID_DEVINTERFACE_WRITEONCEDISK$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_WRITEONCEDISK$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_WRITEONCEDISK", constants$869.GUID_DEVINTERFACE_WRITEONCEDISK$LAYOUT);
    static final  GroupLayout GUID_DEVINTERFACE_VOLUME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_VOLUME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_VOLUME", constants$869.GUID_DEVINTERFACE_VOLUME$LAYOUT);
    static final  GroupLayout GUID_DEVINTERFACE_MEDIUMCHANGER$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_MEDIUMCHANGER$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_MEDIUMCHANGER", constants$869.GUID_DEVINTERFACE_MEDIUMCHANGER$LAYOUT);
    static final  GroupLayout GUID_DEVINTERFACE_FLOPPY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_FLOPPY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_FLOPPY", constants$869.GUID_DEVINTERFACE_FLOPPY$LAYOUT);
    static final  GroupLayout GUID_DEVINTERFACE_CDCHANGER$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_CDCHANGER$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_CDCHANGER", constants$869.GUID_DEVINTERFACE_CDCHANGER$LAYOUT);
}

