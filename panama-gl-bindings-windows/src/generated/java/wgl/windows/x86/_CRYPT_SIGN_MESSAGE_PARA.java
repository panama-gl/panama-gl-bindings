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
 * struct _CRYPT_SIGN_MESSAGE_PARA {
 *     DWORD cbSize;
 *     DWORD dwMsgEncodingType;
 *     PCCERT_CONTEXT pSigningCert;
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     void *pvHashAuxInfo;
 *     DWORD cMsgCert;
 *     PCCERT_CONTEXT *rgpMsgCert;
 *     DWORD cMsgCrl;
 *     PCCRL_CONTEXT *rgpMsgCrl;
 *     DWORD cAuthAttr;
 *     PCRYPT_ATTRIBUTE rgAuthAttr;
 *     DWORD cUnauthAttr;
 *     PCRYPT_ATTRIBUTE rgUnauthAttr;
 *     DWORD dwFlags;
 *     DWORD dwInnerContentType;
 * }
 * }
 */
public class _CRYPT_SIGN_MESSAGE_PARA {

    _CRYPT_SIGN_MESSAGE_PARA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        wgl_h.C_LONG.withName("dwMsgEncodingType"),
        wgl_h.C_POINTER.withName("pSigningCert"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("HashAlgorithm"),
        wgl_h.C_POINTER.withName("pvHashAuxInfo"),
        wgl_h.C_LONG.withName("cMsgCert"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgpMsgCert"),
        wgl_h.C_LONG.withName("cMsgCrl"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgpMsgCrl"),
        wgl_h.C_LONG.withName("cAuthAttr"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgAuthAttr"),
        wgl_h.C_LONG.withName("cUnauthAttr"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgUnauthAttr"),
        wgl_h.C_LONG.withName("dwFlags"),
        wgl_h.C_LONG.withName("dwInnerContentType")
    ).withName("_CRYPT_SIGN_MESSAGE_PARA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwMsgEncodingType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMsgEncodingType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMsgEncodingType
     * }
     */
    public static final OfInt dwMsgEncodingType$layout() {
        return dwMsgEncodingType$LAYOUT;
    }

    private static final long dwMsgEncodingType$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMsgEncodingType
     * }
     */
    public static final long dwMsgEncodingType$offset() {
        return dwMsgEncodingType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMsgEncodingType
     * }
     */
    public static int dwMsgEncodingType(MemorySegment struct) {
        return struct.get(dwMsgEncodingType$LAYOUT, dwMsgEncodingType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMsgEncodingType
     * }
     */
    public static void dwMsgEncodingType(MemorySegment struct, int fieldValue) {
        struct.set(dwMsgEncodingType$LAYOUT, dwMsgEncodingType$OFFSET, fieldValue);
    }

    private static final AddressLayout pSigningCert$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSigningCert"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCCERT_CONTEXT pSigningCert
     * }
     */
    public static final AddressLayout pSigningCert$layout() {
        return pSigningCert$LAYOUT;
    }

    private static final long pSigningCert$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCCERT_CONTEXT pSigningCert
     * }
     */
    public static final long pSigningCert$offset() {
        return pSigningCert$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCCERT_CONTEXT pSigningCert
     * }
     */
    public static MemorySegment pSigningCert(MemorySegment struct) {
        return struct.get(pSigningCert$LAYOUT, pSigningCert$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCCERT_CONTEXT pSigningCert
     * }
     */
    public static void pSigningCert(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pSigningCert$LAYOUT, pSigningCert$OFFSET, fieldValue);
    }

    private static final GroupLayout HashAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("HashAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static final GroupLayout HashAlgorithm$layout() {
        return HashAlgorithm$LAYOUT;
    }

    private static final long HashAlgorithm$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static final long HashAlgorithm$offset() {
        return HashAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static MemorySegment HashAlgorithm(MemorySegment struct) {
        return struct.asSlice(HashAlgorithm$OFFSET, HashAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static void HashAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, HashAlgorithm$OFFSET, HashAlgorithm$LAYOUT.byteSize());
    }

    private static final AddressLayout pvHashAuxInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvHashAuxInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static final AddressLayout pvHashAuxInfo$layout() {
        return pvHashAuxInfo$LAYOUT;
    }

    private static final long pvHashAuxInfo$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static final long pvHashAuxInfo$offset() {
        return pvHashAuxInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static MemorySegment pvHashAuxInfo(MemorySegment struct) {
        return struct.get(pvHashAuxInfo$LAYOUT, pvHashAuxInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static void pvHashAuxInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvHashAuxInfo$LAYOUT, pvHashAuxInfo$OFFSET, fieldValue);
    }

    private static final OfInt cMsgCert$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cMsgCert"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cMsgCert
     * }
     */
    public static final OfInt cMsgCert$layout() {
        return cMsgCert$LAYOUT;
    }

    private static final long cMsgCert$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cMsgCert
     * }
     */
    public static final long cMsgCert$offset() {
        return cMsgCert$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cMsgCert
     * }
     */
    public static int cMsgCert(MemorySegment struct) {
        return struct.get(cMsgCert$LAYOUT, cMsgCert$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cMsgCert
     * }
     */
    public static void cMsgCert(MemorySegment struct, int fieldValue) {
        struct.set(cMsgCert$LAYOUT, cMsgCert$OFFSET, fieldValue);
    }

    private static final AddressLayout rgpMsgCert$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgpMsgCert"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCCERT_CONTEXT *rgpMsgCert
     * }
     */
    public static final AddressLayout rgpMsgCert$layout() {
        return rgpMsgCert$LAYOUT;
    }

    private static final long rgpMsgCert$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCCERT_CONTEXT *rgpMsgCert
     * }
     */
    public static final long rgpMsgCert$offset() {
        return rgpMsgCert$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCCERT_CONTEXT *rgpMsgCert
     * }
     */
    public static MemorySegment rgpMsgCert(MemorySegment struct) {
        return struct.get(rgpMsgCert$LAYOUT, rgpMsgCert$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCCERT_CONTEXT *rgpMsgCert
     * }
     */
    public static void rgpMsgCert(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgpMsgCert$LAYOUT, rgpMsgCert$OFFSET, fieldValue);
    }

    private static final OfInt cMsgCrl$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cMsgCrl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cMsgCrl
     * }
     */
    public static final OfInt cMsgCrl$layout() {
        return cMsgCrl$LAYOUT;
    }

    private static final long cMsgCrl$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cMsgCrl
     * }
     */
    public static final long cMsgCrl$offset() {
        return cMsgCrl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cMsgCrl
     * }
     */
    public static int cMsgCrl(MemorySegment struct) {
        return struct.get(cMsgCrl$LAYOUT, cMsgCrl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cMsgCrl
     * }
     */
    public static void cMsgCrl(MemorySegment struct, int fieldValue) {
        struct.set(cMsgCrl$LAYOUT, cMsgCrl$OFFSET, fieldValue);
    }

    private static final AddressLayout rgpMsgCrl$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgpMsgCrl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCCRL_CONTEXT *rgpMsgCrl
     * }
     */
    public static final AddressLayout rgpMsgCrl$layout() {
        return rgpMsgCrl$LAYOUT;
    }

    private static final long rgpMsgCrl$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCCRL_CONTEXT *rgpMsgCrl
     * }
     */
    public static final long rgpMsgCrl$offset() {
        return rgpMsgCrl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCCRL_CONTEXT *rgpMsgCrl
     * }
     */
    public static MemorySegment rgpMsgCrl(MemorySegment struct) {
        return struct.get(rgpMsgCrl$LAYOUT, rgpMsgCrl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCCRL_CONTEXT *rgpMsgCrl
     * }
     */
    public static void rgpMsgCrl(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgpMsgCrl$LAYOUT, rgpMsgCrl$OFFSET, fieldValue);
    }

    private static final OfInt cAuthAttr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cAuthAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cAuthAttr
     * }
     */
    public static final OfInt cAuthAttr$layout() {
        return cAuthAttr$LAYOUT;
    }

    private static final long cAuthAttr$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cAuthAttr
     * }
     */
    public static final long cAuthAttr$offset() {
        return cAuthAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cAuthAttr
     * }
     */
    public static int cAuthAttr(MemorySegment struct) {
        return struct.get(cAuthAttr$LAYOUT, cAuthAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cAuthAttr
     * }
     */
    public static void cAuthAttr(MemorySegment struct, int fieldValue) {
        struct.set(cAuthAttr$LAYOUT, cAuthAttr$OFFSET, fieldValue);
    }

    private static final AddressLayout rgAuthAttr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgAuthAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAuthAttr
     * }
     */
    public static final AddressLayout rgAuthAttr$layout() {
        return rgAuthAttr$LAYOUT;
    }

    private static final long rgAuthAttr$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAuthAttr
     * }
     */
    public static final long rgAuthAttr$offset() {
        return rgAuthAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAuthAttr
     * }
     */
    public static MemorySegment rgAuthAttr(MemorySegment struct) {
        return struct.get(rgAuthAttr$LAYOUT, rgAuthAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAuthAttr
     * }
     */
    public static void rgAuthAttr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgAuthAttr$LAYOUT, rgAuthAttr$OFFSET, fieldValue);
    }

    private static final OfInt cUnauthAttr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cUnauthAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cUnauthAttr
     * }
     */
    public static final OfInt cUnauthAttr$layout() {
        return cUnauthAttr$LAYOUT;
    }

    private static final long cUnauthAttr$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cUnauthAttr
     * }
     */
    public static final long cUnauthAttr$offset() {
        return cUnauthAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cUnauthAttr
     * }
     */
    public static int cUnauthAttr(MemorySegment struct) {
        return struct.get(cUnauthAttr$LAYOUT, cUnauthAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cUnauthAttr
     * }
     */
    public static void cUnauthAttr(MemorySegment struct, int fieldValue) {
        struct.set(cUnauthAttr$LAYOUT, cUnauthAttr$OFFSET, fieldValue);
    }

    private static final AddressLayout rgUnauthAttr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgUnauthAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgUnauthAttr
     * }
     */
    public static final AddressLayout rgUnauthAttr$layout() {
        return rgUnauthAttr$LAYOUT;
    }

    private static final long rgUnauthAttr$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgUnauthAttr
     * }
     */
    public static final long rgUnauthAttr$offset() {
        return rgUnauthAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgUnauthAttr
     * }
     */
    public static MemorySegment rgUnauthAttr(MemorySegment struct) {
        return struct.get(rgUnauthAttr$LAYOUT, rgUnauthAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgUnauthAttr
     * }
     */
    public static void rgUnauthAttr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgUnauthAttr$LAYOUT, rgUnauthAttr$OFFSET, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final OfInt dwInnerContentType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwInnerContentType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwInnerContentType
     * }
     */
    public static final OfInt dwInnerContentType$layout() {
        return dwInnerContentType$LAYOUT;
    }

    private static final long dwInnerContentType$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwInnerContentType
     * }
     */
    public static final long dwInnerContentType$offset() {
        return dwInnerContentType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwInnerContentType
     * }
     */
    public static int dwInnerContentType(MemorySegment struct) {
        return struct.get(dwInnerContentType$LAYOUT, dwInnerContentType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwInnerContentType
     * }
     */
    public static void dwInnerContentType(MemorySegment struct, int fieldValue) {
        struct.set(dwInnerContentType$LAYOUT, dwInnerContentType$OFFSET, fieldValue);
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

