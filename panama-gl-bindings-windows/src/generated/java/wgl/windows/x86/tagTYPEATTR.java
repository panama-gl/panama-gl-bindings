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
 * struct tagTYPEATTR {
 *     GUID guid;
 *     LCID lcid;
 *     DWORD dwReserved;
 *     MEMBERID memidConstructor;
 *     MEMBERID memidDestructor;
 *     LPOLESTR lpstrSchema;
 *     ULONG cbSizeInstance;
 *     TYPEKIND typekind;
 *     WORD cFuncs;
 *     WORD cVars;
 *     WORD cImplTypes;
 *     WORD cbSizeVft;
 *     WORD cbAlignment;
 *     WORD wTypeFlags;
 *     WORD wMajorVerNum;
 *     WORD wMinorVerNum;
 *     TYPEDESC tdescAlias;
 *     IDLDESC idldescType;
 * }
 * }
 */
public class tagTYPEATTR {

    tagTYPEATTR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GUID.layout().withName("guid"),
        wgl_h.C_LONG.withName("lcid"),
        wgl_h.C_LONG.withName("dwReserved"),
        wgl_h.C_LONG.withName("memidConstructor"),
        wgl_h.C_LONG.withName("memidDestructor"),
        wgl_h.C_POINTER.withName("lpstrSchema"),
        wgl_h.C_LONG.withName("cbSizeInstance"),
        wgl_h.C_INT.withName("typekind"),
        wgl_h.C_SHORT.withName("cFuncs"),
        wgl_h.C_SHORT.withName("cVars"),
        wgl_h.C_SHORT.withName("cImplTypes"),
        wgl_h.C_SHORT.withName("cbSizeVft"),
        wgl_h.C_SHORT.withName("cbAlignment"),
        wgl_h.C_SHORT.withName("wTypeFlags"),
        wgl_h.C_SHORT.withName("wMajorVerNum"),
        wgl_h.C_SHORT.withName("wMinorVerNum"),
        tagTYPEDESC.layout().withName("tdescAlias"),
        tagIDLDESC.layout().withName("idldescType")
    ).withName("tagTYPEATTR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout guid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("guid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID guid
     * }
     */
    public static final GroupLayout guid$layout() {
        return guid$LAYOUT;
    }

    private static final long guid$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID guid
     * }
     */
    public static final long guid$offset() {
        return guid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID guid
     * }
     */
    public static MemorySegment guid(MemorySegment struct) {
        return struct.asSlice(guid$OFFSET, guid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID guid
     * }
     */
    public static void guid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, guid$OFFSET, guid$LAYOUT.byteSize());
    }

    private static final OfInt lcid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LCID lcid
     * }
     */
    public static final OfInt lcid$layout() {
        return lcid$LAYOUT;
    }

    private static final long lcid$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LCID lcid
     * }
     */
    public static final long lcid$offset() {
        return lcid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LCID lcid
     * }
     */
    public static int lcid(MemorySegment struct) {
        return struct.get(lcid$LAYOUT, lcid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LCID lcid
     * }
     */
    public static void lcid(MemorySegment struct, int fieldValue) {
        struct.set(lcid$LAYOUT, lcid$OFFSET, fieldValue);
    }

    private static final OfInt dwReserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwReserved
     * }
     */
    public static final OfInt dwReserved$layout() {
        return dwReserved$LAYOUT;
    }

    private static final long dwReserved$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwReserved
     * }
     */
    public static final long dwReserved$offset() {
        return dwReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwReserved
     * }
     */
    public static int dwReserved(MemorySegment struct) {
        return struct.get(dwReserved$LAYOUT, dwReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwReserved
     * }
     */
    public static void dwReserved(MemorySegment struct, int fieldValue) {
        struct.set(dwReserved$LAYOUT, dwReserved$OFFSET, fieldValue);
    }

    private static final OfInt memidConstructor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("memidConstructor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MEMBERID memidConstructor
     * }
     */
    public static final OfInt memidConstructor$layout() {
        return memidConstructor$LAYOUT;
    }

    private static final long memidConstructor$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MEMBERID memidConstructor
     * }
     */
    public static final long memidConstructor$offset() {
        return memidConstructor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MEMBERID memidConstructor
     * }
     */
    public static int memidConstructor(MemorySegment struct) {
        return struct.get(memidConstructor$LAYOUT, memidConstructor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MEMBERID memidConstructor
     * }
     */
    public static void memidConstructor(MemorySegment struct, int fieldValue) {
        struct.set(memidConstructor$LAYOUT, memidConstructor$OFFSET, fieldValue);
    }

    private static final OfInt memidDestructor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("memidDestructor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MEMBERID memidDestructor
     * }
     */
    public static final OfInt memidDestructor$layout() {
        return memidDestructor$LAYOUT;
    }

    private static final long memidDestructor$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MEMBERID memidDestructor
     * }
     */
    public static final long memidDestructor$offset() {
        return memidDestructor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MEMBERID memidDestructor
     * }
     */
    public static int memidDestructor(MemorySegment struct) {
        return struct.get(memidDestructor$LAYOUT, memidDestructor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MEMBERID memidDestructor
     * }
     */
    public static void memidDestructor(MemorySegment struct, int fieldValue) {
        struct.set(memidDestructor$LAYOUT, memidDestructor$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrSchema$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrSchema"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOLESTR lpstrSchema
     * }
     */
    public static final AddressLayout lpstrSchema$layout() {
        return lpstrSchema$LAYOUT;
    }

    private static final long lpstrSchema$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOLESTR lpstrSchema
     * }
     */
    public static final long lpstrSchema$offset() {
        return lpstrSchema$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOLESTR lpstrSchema
     * }
     */
    public static MemorySegment lpstrSchema(MemorySegment struct) {
        return struct.get(lpstrSchema$LAYOUT, lpstrSchema$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOLESTR lpstrSchema
     * }
     */
    public static void lpstrSchema(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrSchema$LAYOUT, lpstrSchema$OFFSET, fieldValue);
    }

    private static final OfInt cbSizeInstance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSizeInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbSizeInstance
     * }
     */
    public static final OfInt cbSizeInstance$layout() {
        return cbSizeInstance$LAYOUT;
    }

    private static final long cbSizeInstance$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbSizeInstance
     * }
     */
    public static final long cbSizeInstance$offset() {
        return cbSizeInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbSizeInstance
     * }
     */
    public static int cbSizeInstance(MemorySegment struct) {
        return struct.get(cbSizeInstance$LAYOUT, cbSizeInstance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbSizeInstance
     * }
     */
    public static void cbSizeInstance(MemorySegment struct, int fieldValue) {
        struct.set(cbSizeInstance$LAYOUT, cbSizeInstance$OFFSET, fieldValue);
    }

    private static final OfInt typekind$LAYOUT = (OfInt)$LAYOUT.select(groupElement("typekind"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TYPEKIND typekind
     * }
     */
    public static final OfInt typekind$layout() {
        return typekind$LAYOUT;
    }

    private static final long typekind$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TYPEKIND typekind
     * }
     */
    public static final long typekind$offset() {
        return typekind$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TYPEKIND typekind
     * }
     */
    public static int typekind(MemorySegment struct) {
        return struct.get(typekind$LAYOUT, typekind$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TYPEKIND typekind
     * }
     */
    public static void typekind(MemorySegment struct, int fieldValue) {
        struct.set(typekind$LAYOUT, typekind$OFFSET, fieldValue);
    }

    private static final OfShort cFuncs$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cFuncs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD cFuncs
     * }
     */
    public static final OfShort cFuncs$layout() {
        return cFuncs$LAYOUT;
    }

    private static final long cFuncs$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD cFuncs
     * }
     */
    public static final long cFuncs$offset() {
        return cFuncs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD cFuncs
     * }
     */
    public static short cFuncs(MemorySegment struct) {
        return struct.get(cFuncs$LAYOUT, cFuncs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD cFuncs
     * }
     */
    public static void cFuncs(MemorySegment struct, short fieldValue) {
        struct.set(cFuncs$LAYOUT, cFuncs$OFFSET, fieldValue);
    }

    private static final OfShort cVars$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cVars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD cVars
     * }
     */
    public static final OfShort cVars$layout() {
        return cVars$LAYOUT;
    }

    private static final long cVars$OFFSET = 50;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD cVars
     * }
     */
    public static final long cVars$offset() {
        return cVars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD cVars
     * }
     */
    public static short cVars(MemorySegment struct) {
        return struct.get(cVars$LAYOUT, cVars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD cVars
     * }
     */
    public static void cVars(MemorySegment struct, short fieldValue) {
        struct.set(cVars$LAYOUT, cVars$OFFSET, fieldValue);
    }

    private static final OfShort cImplTypes$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cImplTypes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD cImplTypes
     * }
     */
    public static final OfShort cImplTypes$layout() {
        return cImplTypes$LAYOUT;
    }

    private static final long cImplTypes$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD cImplTypes
     * }
     */
    public static final long cImplTypes$offset() {
        return cImplTypes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD cImplTypes
     * }
     */
    public static short cImplTypes(MemorySegment struct) {
        return struct.get(cImplTypes$LAYOUT, cImplTypes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD cImplTypes
     * }
     */
    public static void cImplTypes(MemorySegment struct, short fieldValue) {
        struct.set(cImplTypes$LAYOUT, cImplTypes$OFFSET, fieldValue);
    }

    private static final OfShort cbSizeVft$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cbSizeVft"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD cbSizeVft
     * }
     */
    public static final OfShort cbSizeVft$layout() {
        return cbSizeVft$LAYOUT;
    }

    private static final long cbSizeVft$OFFSET = 54;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD cbSizeVft
     * }
     */
    public static final long cbSizeVft$offset() {
        return cbSizeVft$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD cbSizeVft
     * }
     */
    public static short cbSizeVft(MemorySegment struct) {
        return struct.get(cbSizeVft$LAYOUT, cbSizeVft$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD cbSizeVft
     * }
     */
    public static void cbSizeVft(MemorySegment struct, short fieldValue) {
        struct.set(cbSizeVft$LAYOUT, cbSizeVft$OFFSET, fieldValue);
    }

    private static final OfShort cbAlignment$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cbAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD cbAlignment
     * }
     */
    public static final OfShort cbAlignment$layout() {
        return cbAlignment$LAYOUT;
    }

    private static final long cbAlignment$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD cbAlignment
     * }
     */
    public static final long cbAlignment$offset() {
        return cbAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD cbAlignment
     * }
     */
    public static short cbAlignment(MemorySegment struct) {
        return struct.get(cbAlignment$LAYOUT, cbAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD cbAlignment
     * }
     */
    public static void cbAlignment(MemorySegment struct, short fieldValue) {
        struct.set(cbAlignment$LAYOUT, cbAlignment$OFFSET, fieldValue);
    }

    private static final OfShort wTypeFlags$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wTypeFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wTypeFlags
     * }
     */
    public static final OfShort wTypeFlags$layout() {
        return wTypeFlags$LAYOUT;
    }

    private static final long wTypeFlags$OFFSET = 58;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wTypeFlags
     * }
     */
    public static final long wTypeFlags$offset() {
        return wTypeFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wTypeFlags
     * }
     */
    public static short wTypeFlags(MemorySegment struct) {
        return struct.get(wTypeFlags$LAYOUT, wTypeFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wTypeFlags
     * }
     */
    public static void wTypeFlags(MemorySegment struct, short fieldValue) {
        struct.set(wTypeFlags$LAYOUT, wTypeFlags$OFFSET, fieldValue);
    }

    private static final OfShort wMajorVerNum$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wMajorVerNum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wMajorVerNum
     * }
     */
    public static final OfShort wMajorVerNum$layout() {
        return wMajorVerNum$LAYOUT;
    }

    private static final long wMajorVerNum$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wMajorVerNum
     * }
     */
    public static final long wMajorVerNum$offset() {
        return wMajorVerNum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wMajorVerNum
     * }
     */
    public static short wMajorVerNum(MemorySegment struct) {
        return struct.get(wMajorVerNum$LAYOUT, wMajorVerNum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wMajorVerNum
     * }
     */
    public static void wMajorVerNum(MemorySegment struct, short fieldValue) {
        struct.set(wMajorVerNum$LAYOUT, wMajorVerNum$OFFSET, fieldValue);
    }

    private static final OfShort wMinorVerNum$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wMinorVerNum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wMinorVerNum
     * }
     */
    public static final OfShort wMinorVerNum$layout() {
        return wMinorVerNum$LAYOUT;
    }

    private static final long wMinorVerNum$OFFSET = 62;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wMinorVerNum
     * }
     */
    public static final long wMinorVerNum$offset() {
        return wMinorVerNum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wMinorVerNum
     * }
     */
    public static short wMinorVerNum(MemorySegment struct) {
        return struct.get(wMinorVerNum$LAYOUT, wMinorVerNum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wMinorVerNum
     * }
     */
    public static void wMinorVerNum(MemorySegment struct, short fieldValue) {
        struct.set(wMinorVerNum$LAYOUT, wMinorVerNum$OFFSET, fieldValue);
    }

    private static final GroupLayout tdescAlias$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("tdescAlias"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TYPEDESC tdescAlias
     * }
     */
    public static final GroupLayout tdescAlias$layout() {
        return tdescAlias$LAYOUT;
    }

    private static final long tdescAlias$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TYPEDESC tdescAlias
     * }
     */
    public static final long tdescAlias$offset() {
        return tdescAlias$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TYPEDESC tdescAlias
     * }
     */
    public static MemorySegment tdescAlias(MemorySegment struct) {
        return struct.asSlice(tdescAlias$OFFSET, tdescAlias$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TYPEDESC tdescAlias
     * }
     */
    public static void tdescAlias(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, tdescAlias$OFFSET, tdescAlias$LAYOUT.byteSize());
    }

    private static final GroupLayout idldescType$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("idldescType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * IDLDESC idldescType
     * }
     */
    public static final GroupLayout idldescType$layout() {
        return idldescType$LAYOUT;
    }

    private static final long idldescType$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * IDLDESC idldescType
     * }
     */
    public static final long idldescType$offset() {
        return idldescType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * IDLDESC idldescType
     * }
     */
    public static MemorySegment idldescType(MemorySegment struct) {
        return struct.asSlice(idldescType$OFFSET, idldescType$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * IDLDESC idldescType
     * }
     */
    public static void idldescType(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, idldescType$OFFSET, idldescType$LAYOUT.byteSize());
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

