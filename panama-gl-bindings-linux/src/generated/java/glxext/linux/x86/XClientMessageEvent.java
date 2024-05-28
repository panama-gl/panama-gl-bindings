// Generated by jextract

package glxext.linux.x86;

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
 *     int type;
 *     unsigned long serial;
 *     int send_event;
 *     Display *display;
 *     Window window;
 *     Atom message_type;
 *     int format;
 *     union {
 *         char b[20];
 *         short s[10];
 *         long l[5];
 *     } data;
 * }
 * }
 */
public class XClientMessageEvent {

    XClientMessageEvent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        glxext_h.C_LONG.withName("serial"),
        glxext_h.C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        glxext_h.C_POINTER.withName("display"),
        glxext_h.C_LONG.withName("window"),
        glxext_h.C_LONG.withName("message_type"),
        glxext_h.C_INT.withName("format"),
        MemoryLayout.paddingLayout(4),
        XClientMessageEvent.data.layout().withName("data")
    ).withName("$anon$897:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfLong serial$LAYOUT = (OfLong)$LAYOUT.select(groupElement("serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static final OfLong serial$layout() {
        return serial$LAYOUT;
    }

    private static final long serial$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static final long serial$offset() {
        return serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static long serial(MemorySegment struct) {
        return struct.get(serial$LAYOUT, serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static void serial(MemorySegment struct, long fieldValue) {
        struct.set(serial$LAYOUT, serial$OFFSET, fieldValue);
    }

    private static final OfInt send_event$LAYOUT = (OfInt)$LAYOUT.select(groupElement("send_event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static final OfInt send_event$layout() {
        return send_event$LAYOUT;
    }

    private static final long send_event$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static final long send_event$offset() {
        return send_event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static int send_event(MemorySegment struct) {
        return struct.get(send_event$LAYOUT, send_event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static void send_event(MemorySegment struct, int fieldValue) {
        struct.set(send_event$LAYOUT, send_event$OFFSET, fieldValue);
    }

    private static final AddressLayout display$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("display"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static final AddressLayout display$layout() {
        return display$LAYOUT;
    }

    private static final long display$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static final long display$offset() {
        return display$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static MemorySegment display(MemorySegment struct) {
        return struct.get(display$LAYOUT, display$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static void display(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(display$LAYOUT, display$OFFSET, fieldValue);
    }

    private static final OfLong window$LAYOUT = (OfLong)$LAYOUT.select(groupElement("window"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static final OfLong window$layout() {
        return window$LAYOUT;
    }

    private static final long window$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static final long window$offset() {
        return window$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static long window(MemorySegment struct) {
        return struct.get(window$LAYOUT, window$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static void window(MemorySegment struct, long fieldValue) {
        struct.set(window$LAYOUT, window$OFFSET, fieldValue);
    }

    private static final OfLong message_type$LAYOUT = (OfLong)$LAYOUT.select(groupElement("message_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Atom message_type
     * }
     */
    public static final OfLong message_type$layout() {
        return message_type$LAYOUT;
    }

    private static final long message_type$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Atom message_type
     * }
     */
    public static final long message_type$offset() {
        return message_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Atom message_type
     * }
     */
    public static long message_type(MemorySegment struct) {
        return struct.get(message_type$LAYOUT, message_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Atom message_type
     * }
     */
    public static void message_type(MemorySegment struct, long fieldValue) {
        struct.set(message_type$LAYOUT, message_type$OFFSET, fieldValue);
    }

    private static final OfInt format$LAYOUT = (OfInt)$LAYOUT.select(groupElement("format"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static final OfInt format$layout() {
        return format$LAYOUT;
    }

    private static final long format$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static final long format$offset() {
        return format$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static int format(MemorySegment struct) {
        return struct.get(format$LAYOUT, format$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static void format(MemorySegment struct, int fieldValue) {
        struct.set(format$LAYOUT, format$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     char b[20];
     *     short s[10];
     *     long l[5];
     * }
     * }
     */
    public static class data {

        data() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(20, glxext_h.C_CHAR).withName("b"),
            MemoryLayout.sequenceLayout(10, glxext_h.C_SHORT).withName("s"),
            MemoryLayout.sequenceLayout(5, glxext_h.C_LONG).withName("l")
        ).withName("$anon$905:2");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final SequenceLayout b$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("b"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * char b[20]
         * }
         */
        public static final SequenceLayout b$layout() {
            return b$LAYOUT;
        }

        private static final long b$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * char b[20]
         * }
         */
        public static final long b$offset() {
            return b$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * char b[20]
         * }
         */
        public static MemorySegment b(MemorySegment union) {
            return union.asSlice(b$OFFSET, b$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * char b[20]
         * }
         */
        public static void b(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, b$OFFSET, b$LAYOUT.byteSize());
        }

        private static long[] b$DIMS = { 20 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * char b[20]
         * }
         */
        public static long[] b$dimensions() {
            return b$DIMS;
        }
        private static final VarHandle b$ELEM_HANDLE = b$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * char b[20]
         * }
         */
        public static byte b(MemorySegment union, long index0) {
            return (byte)b$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * char b[20]
         * }
         */
        public static void b(MemorySegment union, long index0, byte fieldValue) {
            b$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        private static final SequenceLayout s$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("s"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * short s[10]
         * }
         */
        public static final SequenceLayout s$layout() {
            return s$LAYOUT;
        }

        private static final long s$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * short s[10]
         * }
         */
        public static final long s$offset() {
            return s$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * short s[10]
         * }
         */
        public static MemorySegment s(MemorySegment union) {
            return union.asSlice(s$OFFSET, s$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * short s[10]
         * }
         */
        public static void s(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, s$OFFSET, s$LAYOUT.byteSize());
        }

        private static long[] s$DIMS = { 10 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * short s[10]
         * }
         */
        public static long[] s$dimensions() {
            return s$DIMS;
        }
        private static final VarHandle s$ELEM_HANDLE = s$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * short s[10]
         * }
         */
        public static short s(MemorySegment union, long index0) {
            return (short)s$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * short s[10]
         * }
         */
        public static void s(MemorySegment union, long index0, short fieldValue) {
            s$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        private static final SequenceLayout l$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("l"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * long l[5]
         * }
         */
        public static final SequenceLayout l$layout() {
            return l$LAYOUT;
        }

        private static final long l$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * long l[5]
         * }
         */
        public static final long l$offset() {
            return l$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * long l[5]
         * }
         */
        public static MemorySegment l(MemorySegment union) {
            return union.asSlice(l$OFFSET, l$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * long l[5]
         * }
         */
        public static void l(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, l$OFFSET, l$LAYOUT.byteSize());
        }

        private static long[] l$DIMS = { 5 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * long l[5]
         * }
         */
        public static long[] l$dimensions() {
            return l$DIMS;
        }
        private static final VarHandle l$ELEM_HANDLE = l$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * long l[5]
         * }
         */
        public static long l(MemorySegment union, long index0) {
            return (long)l$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * long l[5]
         * }
         */
        public static void l(MemorySegment union, long index0, long fieldValue) {
            l$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout data$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     char b[20];
     *     short s[10];
     *     long l[5];
     * } data
     * }
     */
    public static final GroupLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     char b[20];
     *     short s[10];
     *     long l[5];
     * } data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     char b[20];
     *     short s[10];
     *     long l[5];
     * } data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.asSlice(data$OFFSET, data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     char b[20];
     *     short s[10];
     *     long l[5];
     * } data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, data$OFFSET, data$LAYOUT.byteSize());
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

