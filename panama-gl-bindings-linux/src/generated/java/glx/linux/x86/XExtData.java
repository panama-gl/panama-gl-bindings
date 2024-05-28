// Generated by jextract

package glx.linux.x86;

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
 * typedef struct _XExtData {
 *     int number;
 *     struct _XExtData *next;
 *     int (*free_private)(struct _XExtData *);
 *     XPointer private_data;
 * } XExtData
 * }
 */
public class XExtData extends _XExtData {

    XExtData() {
        // Should not be called directly
    }
}

