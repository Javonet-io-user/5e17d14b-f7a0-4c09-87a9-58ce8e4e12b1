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

public class RFID extends Phidget {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setAntenna(java.lang.Boolean value) {
    try {
      javonetHandle.set("Antenna", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAntenna() {
    try {
      java.lang.Boolean res = javonetHandle.get("Antenna");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLED(java.lang.Boolean value) {
    try {
      javonetHandle.set("LED", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getLED() {
    try {
      java.lang.Boolean res = javonetHandle.get("LED");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public RFIDDigitalOutputCollection getoutputs() {
    try {
      Object res = javonetHandle.<NObject>get("outputs");
      if (res == null) return null;
      return new RFIDDigitalOutputCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setoutputs(RFIDDigitalOutputCollection param) {
    try {
      javonetHandle.set("outputs", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RFID() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Phidgets.RFID");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "RFIDTag",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (TagEventHandler handler : _RFIDTagListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], TagEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RFIDTagLost",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (TagEventHandler handler : _RFIDTagLostListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], TagEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OutputChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (OutputChangeEventHandler handler : _OutputChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], OutputChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RFID(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<TagEventHandler> _RFIDTagListeners =
      new java.util.ArrayList<TagEventHandler>();

  public void addRFIDTag(TagEventHandler toAdd) {
    _RFIDTagListeners.add(toAdd);
  }

  public void removeRFIDTag(TagEventHandler toRemove) {
    _RFIDTagListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<TagEventHandler> _RFIDTagLostListeners =
      new java.util.ArrayList<TagEventHandler>();

  public void addRFIDTagLost(TagEventHandler toAdd) {
    _RFIDTagLostListeners.add(toAdd);
  }

  public void removeRFIDTagLost(TagEventHandler toRemove) {
    _RFIDTagLostListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<OutputChangeEventHandler> _OutputChangeListeners =
      new java.util.ArrayList<OutputChangeEventHandler>();

  public void addOutputChange(OutputChangeEventHandler toAdd) {
    _OutputChangeListeners.add(toAdd);
  }

  public void removeOutputChange(OutputChangeEventHandler toRemove) {
    _OutputChangeListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
