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
 * typedef union _XEvent {
 *     int type;
 *     XAnyEvent xany;
 *     XKeyEvent xkey;
 *     XButtonEvent xbutton;
 *     XMotionEvent xmotion;
 *     XCrossingEvent xcrossing;
 *     XFocusChangeEvent xfocus;
 *     XExposeEvent xexpose;
 *     XGraphicsExposeEvent xgraphicsexpose;
 *     XNoExposeEvent xnoexpose;
 *     XVisibilityEvent xvisibility;
 *     XCreateWindowEvent xcreatewindow;
 *     XDestroyWindowEvent xdestroywindow;
 *     XUnmapEvent xunmap;
 *     XMapEvent xmap;
 *     XMapRequestEvent xmaprequest;
 *     XReparentEvent xreparent;
 *     XConfigureEvent xconfigure;
 *     XGravityEvent xgravity;
 *     XResizeRequestEvent xresizerequest;
 *     XConfigureRequestEvent xconfigurerequest;
 *     XCirculateEvent xcirculate;
 *     XCirculateRequestEvent xcirculaterequest;
 *     XPropertyEvent xproperty;
 *     XSelectionClearEvent xselectionclear;
 *     XSelectionRequestEvent xselectionrequest;
 *     XSelectionEvent xselection;
 *     XColormapEvent xcolormap;
 *     XClientMessageEvent xclient;
 *     XMappingEvent xmapping;
 *     XErrorEvent xerror;
 *     XKeymapEvent xkeymap;
 *     XGenericEvent xgeneric;
 *     XGenericEventCookie xcookie;
 *     long pad[24];
 * } XEvent
 * }
 */
public class XEvent extends _XEvent {

    XEvent() {
        // Should not be called directly
    }
}
