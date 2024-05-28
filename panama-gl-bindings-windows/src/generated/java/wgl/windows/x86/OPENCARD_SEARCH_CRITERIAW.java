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
 * struct {
 *     DWORD dwStructSize;
 *     LPWSTR lpstrGroupNames;
 *     DWORD nMaxGroupNames;
 *     LPCGUID rgguidInterfaces;
 *     DWORD cguidInterfaces;
 *     LPWSTR lpstrCardNames;
 *     DWORD nMaxCardNames;
 *     LPOCNCHKPROC lpfnCheck;
 *     LPOCNCONNPROCW lpfnConnect;
 *     LPOCNDSCPROC lpfnDisconnect;
 *     LPVOID pvUserData;
 *     DWORD dwShareMode;
 *     DWORD dwPreferredProtocols;
 * }
 * }
 */
public class OPENCARD_SEARCH_CRITERIAW {

    OPENCARD_SEARCH_CRITERIAW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwStructSize"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("lpstrGroupNames"),
        wgl_h.C_LONG.withName("nMaxGroupNames"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgguidInterfaces"),
        wgl_h.C_LONG.withName("cguidInterfaces"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("lpstrCardNames"),
        wgl_h.C_LONG.withName("nMaxCardNames"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("lpfnCheck"),
        wgl_h.C_POINTER.withName("lpfnConnect"),
        wgl_h.C_POINTER.withName("lpfnDisconnect"),
        wgl_h.C_POINTER.withName("pvUserData"),
        wgl_h.C_LONG.withName("dwShareMode"),
        wgl_h.C_LONG.withName("dwPreferredProtocols")
    ).withName("$anon$920:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwStructSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStructSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static final OfInt dwStructSize$layout() {
        return dwStructSize$LAYOUT;
    }

    private static final long dwStructSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static final long dwStructSize$offset() {
        return dwStructSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static int dwStructSize(MemorySegment struct) {
        return struct.get(dwStructSize$LAYOUT, dwStructSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static void dwStructSize(MemorySegment struct, int fieldValue) {
        struct.set(dwStructSize$LAYOUT, dwStructSize$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrGroupNames$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrGroupNames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpstrGroupNames
     * }
     */
    public static final AddressLayout lpstrGroupNames$layout() {
        return lpstrGroupNames$LAYOUT;
    }

    private static final long lpstrGroupNames$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpstrGroupNames
     * }
     */
    public static final long lpstrGroupNames$offset() {
        return lpstrGroupNames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrGroupNames
     * }
     */
    public static MemorySegment lpstrGroupNames(MemorySegment struct) {
        return struct.get(lpstrGroupNames$LAYOUT, lpstrGroupNames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrGroupNames
     * }
     */
    public static void lpstrGroupNames(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrGroupNames$LAYOUT, lpstrGroupNames$OFFSET, fieldValue);
    }

    private static final OfInt nMaxGroupNames$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nMaxGroupNames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nMaxGroupNames
     * }
     */
    public static final OfInt nMaxGroupNames$layout() {
        return nMaxGroupNames$LAYOUT;
    }

    private static final long nMaxGroupNames$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nMaxGroupNames
     * }
     */
    public static final long nMaxGroupNames$offset() {
        return nMaxGroupNames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nMaxGroupNames
     * }
     */
    public static int nMaxGroupNames(MemorySegment struct) {
        return struct.get(nMaxGroupNames$LAYOUT, nMaxGroupNames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nMaxGroupNames
     * }
     */
    public static void nMaxGroupNames(MemorySegment struct, int fieldValue) {
        struct.set(nMaxGroupNames$LAYOUT, nMaxGroupNames$OFFSET, fieldValue);
    }

    private static final AddressLayout rgguidInterfaces$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgguidInterfaces"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCGUID rgguidInterfaces
     * }
     */
    public static final AddressLayout rgguidInterfaces$layout() {
        return rgguidInterfaces$LAYOUT;
    }

    private static final long rgguidInterfaces$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCGUID rgguidInterfaces
     * }
     */
    public static final long rgguidInterfaces$offset() {
        return rgguidInterfaces$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCGUID rgguidInterfaces
     * }
     */
    public static MemorySegment rgguidInterfaces(MemorySegment struct) {
        return struct.get(rgguidInterfaces$LAYOUT, rgguidInterfaces$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCGUID rgguidInterfaces
     * }
     */
    public static void rgguidInterfaces(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgguidInterfaces$LAYOUT, rgguidInterfaces$OFFSET, fieldValue);
    }

    private static final OfInt cguidInterfaces$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cguidInterfaces"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cguidInterfaces
     * }
     */
    public static final OfInt cguidInterfaces$layout() {
        return cguidInterfaces$LAYOUT;
    }

    private static final long cguidInterfaces$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cguidInterfaces
     * }
     */
    public static final long cguidInterfaces$offset() {
        return cguidInterfaces$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cguidInterfaces
     * }
     */
    public static int cguidInterfaces(MemorySegment struct) {
        return struct.get(cguidInterfaces$LAYOUT, cguidInterfaces$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cguidInterfaces
     * }
     */
    public static void cguidInterfaces(MemorySegment struct, int fieldValue) {
        struct.set(cguidInterfaces$LAYOUT, cguidInterfaces$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrCardNames$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrCardNames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCardNames
     * }
     */
    public static final AddressLayout lpstrCardNames$layout() {
        return lpstrCardNames$LAYOUT;
    }

    private static final long lpstrCardNames$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCardNames
     * }
     */
    public static final long lpstrCardNames$offset() {
        return lpstrCardNames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCardNames
     * }
     */
    public static MemorySegment lpstrCardNames(MemorySegment struct) {
        return struct.get(lpstrCardNames$LAYOUT, lpstrCardNames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCardNames
     * }
     */
    public static void lpstrCardNames(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrCardNames$LAYOUT, lpstrCardNames$OFFSET, fieldValue);
    }

    private static final OfInt nMaxCardNames$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nMaxCardNames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nMaxCardNames
     * }
     */
    public static final OfInt nMaxCardNames$layout() {
        return nMaxCardNames$LAYOUT;
    }

    private static final long nMaxCardNames$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nMaxCardNames
     * }
     */
    public static final long nMaxCardNames$offset() {
        return nMaxCardNames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nMaxCardNames
     * }
     */
    public static int nMaxCardNames(MemorySegment struct) {
        return struct.get(nMaxCardNames$LAYOUT, nMaxCardNames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nMaxCardNames
     * }
     */
    public static void nMaxCardNames(MemorySegment struct, int fieldValue) {
        struct.set(nMaxCardNames$LAYOUT, nMaxCardNames$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnCheck$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnCheck"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOCNCHKPROC lpfnCheck
     * }
     */
    public static final AddressLayout lpfnCheck$layout() {
        return lpfnCheck$LAYOUT;
    }

    private static final long lpfnCheck$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOCNCHKPROC lpfnCheck
     * }
     */
    public static final long lpfnCheck$offset() {
        return lpfnCheck$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOCNCHKPROC lpfnCheck
     * }
     */
    public static MemorySegment lpfnCheck(MemorySegment struct) {
        return struct.get(lpfnCheck$LAYOUT, lpfnCheck$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOCNCHKPROC lpfnCheck
     * }
     */
    public static void lpfnCheck(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnCheck$LAYOUT, lpfnCheck$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnConnect$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnConnect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOCNCONNPROCW lpfnConnect
     * }
     */
    public static final AddressLayout lpfnConnect$layout() {
        return lpfnConnect$LAYOUT;
    }

    private static final long lpfnConnect$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOCNCONNPROCW lpfnConnect
     * }
     */
    public static final long lpfnConnect$offset() {
        return lpfnConnect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOCNCONNPROCW lpfnConnect
     * }
     */
    public static MemorySegment lpfnConnect(MemorySegment struct) {
        return struct.get(lpfnConnect$LAYOUT, lpfnConnect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOCNCONNPROCW lpfnConnect
     * }
     */
    public static void lpfnConnect(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnConnect$LAYOUT, lpfnConnect$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnDisconnect$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnDisconnect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOCNDSCPROC lpfnDisconnect
     * }
     */
    public static final AddressLayout lpfnDisconnect$layout() {
        return lpfnDisconnect$LAYOUT;
    }

    private static final long lpfnDisconnect$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOCNDSCPROC lpfnDisconnect
     * }
     */
    public static final long lpfnDisconnect$offset() {
        return lpfnDisconnect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOCNDSCPROC lpfnDisconnect
     * }
     */
    public static MemorySegment lpfnDisconnect(MemorySegment struct) {
        return struct.get(lpfnDisconnect$LAYOUT, lpfnDisconnect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOCNDSCPROC lpfnDisconnect
     * }
     */
    public static void lpfnDisconnect(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnDisconnect$LAYOUT, lpfnDisconnect$OFFSET, fieldValue);
    }

    private static final AddressLayout pvUserData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvUserData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID pvUserData
     * }
     */
    public static final AddressLayout pvUserData$layout() {
        return pvUserData$LAYOUT;
    }

    private static final long pvUserData$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID pvUserData
     * }
     */
    public static final long pvUserData$offset() {
        return pvUserData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID pvUserData
     * }
     */
    public static MemorySegment pvUserData(MemorySegment struct) {
        return struct.get(pvUserData$LAYOUT, pvUserData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID pvUserData
     * }
     */
    public static void pvUserData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvUserData$LAYOUT, pvUserData$OFFSET, fieldValue);
    }

    private static final OfInt dwShareMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwShareMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwShareMode
     * }
     */
    public static final OfInt dwShareMode$layout() {
        return dwShareMode$LAYOUT;
    }

    private static final long dwShareMode$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwShareMode
     * }
     */
    public static final long dwShareMode$offset() {
        return dwShareMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwShareMode
     * }
     */
    public static int dwShareMode(MemorySegment struct) {
        return struct.get(dwShareMode$LAYOUT, dwShareMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwShareMode
     * }
     */
    public static void dwShareMode(MemorySegment struct, int fieldValue) {
        struct.set(dwShareMode$LAYOUT, dwShareMode$OFFSET, fieldValue);
    }

    private static final OfInt dwPreferredProtocols$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPreferredProtocols"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPreferredProtocols
     * }
     */
    public static final OfInt dwPreferredProtocols$layout() {
        return dwPreferredProtocols$LAYOUT;
    }

    private static final long dwPreferredProtocols$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPreferredProtocols
     * }
     */
    public static final long dwPreferredProtocols$offset() {
        return dwPreferredProtocols$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPreferredProtocols
     * }
     */
    public static int dwPreferredProtocols(MemorySegment struct) {
        return struct.get(dwPreferredProtocols$LAYOUT, dwPreferredProtocols$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPreferredProtocols
     * }
     */
    public static void dwPreferredProtocols(MemorySegment struct, int fieldValue) {
        struct.set(dwPreferredProtocols$LAYOUT, dwPreferredProtocols$OFFSET, fieldValue);
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

