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
import Phidgets.Events.*;
import jio.System.*;

public class Manager {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public PhidgetCollection getDevices() {
    try {
      Object res = javonetHandle.<NObject>get("Devices");
      if (res == null) return null;
      return new PhidgetCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDevices(PhidgetCollection param) {
    try {
      javonetHandle.set("Devices", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Manager() {
    try {
      javonetHandle = Javonet.New("Phidgets.Manager");
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
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Manager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void start() {
    try {
      javonetHandle.invoke("start");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
