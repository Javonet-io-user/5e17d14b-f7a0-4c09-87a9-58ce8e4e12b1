package Phidgets;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Phidgets.*;
import jio.System.*;
import Phidgets.Events.*;

public class Phidget {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getSerialNumber() {
    try {
      java.lang.Long res = javonetHandle.get("SerialNumber");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getVersion() {
    try {
      java.lang.Long res = javonetHandle.get("Version");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAttached() {
    try {
      java.lang.Boolean res = javonetHandle.get("Attached");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getType() {
    try {
      java.lang.String res = javonetHandle.get("Type");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTag() {
    try {
      java.lang.String res = javonetHandle.get("Tag");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public Phidget() {
    try {
      javonetHandle = Javonet.New("Phidgets.Phidget");
      javonetHandle.addEventListener(
          "Attach",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AttachEventHandler handler : _AttachListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], AttachEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Detach",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DetachEventHandler handler : _DetachListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], DetachEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Error",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ErrorEventHandler handler : _ErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ErrorEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Phidget(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void open(java.lang.Integer serialNumber) {
    try {
      javonetHandle.invoke("open", serialNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void open() {
    try {
      javonetHandle.invoke("open");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void close() {
    try {
      javonetHandle.invoke("close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(Object comp) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", comp);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Event */

  private java.util.ArrayList<AttachEventHandler> _AttachListeners =
      new java.util.ArrayList<AttachEventHandler>();

  public void addAttach(AttachEventHandler toAdd) {
    _AttachListeners.add(toAdd);
  }

  public void removeAttach(AttachEventHandler toRemove) {
    _AttachListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DetachEventHandler> _DetachListeners =
      new java.util.ArrayList<DetachEventHandler>();

  public void addDetach(DetachEventHandler toAdd) {
    _DetachListeners.add(toAdd);
  }

  public void removeDetach(DetachEventHandler toRemove) {
    _DetachListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ErrorEventHandler> _ErrorListeners =
      new java.util.ArrayList<ErrorEventHandler>();

  public void addError(ErrorEventHandler toAdd) {
    _ErrorListeners.add(toAdd);
  }

  public void removeError(ErrorEventHandler toRemove) {
    _ErrorListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
