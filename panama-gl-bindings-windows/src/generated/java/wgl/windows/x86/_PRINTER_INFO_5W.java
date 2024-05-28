// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _PRINTER_INFO_5W {
 *     LPWSTR pPrinterName;
 *     LPWSTR pPortName;
 *     DWORD Attributes;
 *     DWORD DeviceNotSelectedTimeout;
 *     DWORD TransmissionRetryTimeout;
 * }
 * }
 */
public class _PRINTER_INFO_5W {

    _PRINTER_INFO_5W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("pPrinterName"),
        wgl_h.C_POINTER.withName("pPortName"),
        wgl_h.C_LONG.withName("Attributes"),
        wgl_h.C_LONG.withName("DeviceNotSelectedTimeout"),
        wgl_h.C_LONG.withName("TransmissionRetryTimeout"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PRINTER_INFO_5W");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pPrinterName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPrinterName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static final AddressLayout pPrinterName$layout() {
        return pPrinterName$LAYOUT;
    }

    private static final long pPrinterName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static final long pPrinterName$offset() {
        return pPrinterName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static MemorySegment pPrinterName(MemorySegment struct) {
        return struct.get(pPrinterName$LAYOUT, pPrinterName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static void pPrinterName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pPrinterName$LAYOUT, pPrinterName$OFFSET, fieldValue);
    }

    private static final AddressLayout pPortName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPortName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pPortName
     * }
     */
    public static final AddressLayout pPortName$layout() {
        return pPortName$LAYOUT;
    }

    private static final long pPortName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pPortName
     * }
     */
    public static final long pPortName$offset() {
        return pPortName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pPortName
     * }
     */
    public static MemorySegment pPortName(MemorySegment struct) {
        return struct.get(pPortName$LAYOUT, pPortName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pPortName
     * }
     */
    public static void pPortName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pPortName$LAYOUT, pPortName$OFFSET, fieldValue);
    }

    private static final OfInt Attributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static final OfInt Attributes$layout() {
        return Attributes$LAYOUT;
    }

    private static final long Attributes$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static final long Attributes$offset() {
        return Attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static int Attributes(MemorySegment struct) {
        return struct.get(Attributes$LAYOUT, Attributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static void Attributes(MemorySegment struct, int fieldValue) {
        struct.set(Attributes$LAYOUT, Attributes$OFFSET, fieldValue);
    }

    private static final OfInt DeviceNotSelectedTimeout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DeviceNotSelectedTimeout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DeviceNotSelectedTimeout
     * }
     */
    public static final OfInt DeviceNotSelectedTimeout$layout() {
        return DeviceNotSelectedTimeout$LAYOUT;
    }

    private static final long DeviceNotSelectedTimeout$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DeviceNotSelectedTimeout
     * }
     */
    public static final long DeviceNotSelectedTimeout$offset() {
        return DeviceNotSelectedTimeout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DeviceNotSelectedTimeout
     * }
     */
    public static int DeviceNotSelectedTimeout(MemorySegment struct) {
        return struct.get(DeviceNotSelectedTimeout$LAYOUT, DeviceNotSelectedTimeout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DeviceNotSelectedTimeout
     * }
     */
    public static void DeviceNotSelectedTimeout(MemorySegment struct, int fieldValue) {
        struct.set(DeviceNotSelectedTimeout$LAYOUT, DeviceNotSelectedTimeout$OFFSET, fieldValue);
    }

    private static final OfInt TransmissionRetryTimeout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TransmissionRetryTimeout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TransmissionRetryTimeout
     * }
     */
    public static final OfInt TransmissionRetryTimeout$layout() {
        return TransmissionRetryTimeout$LAYOUT;
    }

    private static final long TransmissionRetryTimeout$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TransmissionRetryTimeout
     * }
     */
    public static final long TransmissionRetryTimeout$offset() {
        return TransmissionRetryTimeout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TransmissionRetryTimeout
     * }
     */
    public static int TransmissionRetryTimeout(MemorySegment struct) {
        return struct.get(TransmissionRetryTimeout$LAYOUT, TransmissionRetryTimeout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TransmissionRetryTimeout
     * }
     */
    public static void TransmissionRetryTimeout(MemorySegment struct, int fieldValue) {
        struct.set(TransmissionRetryTimeout$LAYOUT, TransmissionRetryTimeout$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

