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

public class InterfaceKit extends Phidget {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setratiometric(java.lang.Boolean value) {
    try {
      javonetHandle.set("ratiometric", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getratiometric() {
    try {
      java.lang.Boolean res = javonetHandle.get("ratiometric");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public InterfaceKitDigitalInputCollection getinputs() {
    try {
      Object res = javonetHandle.<NObject>get("inputs");
      if (res == null) return null;
      return new InterfaceKitDigitalInputCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setinputs(InterfaceKitDigitalInputCollection param) {
    try {
      javonetHandle.set("inputs", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public InterfaceKitDigitalOutputCollection getoutputs() {
    try {
      Object res = javonetHandle.<NObject>get("outputs");
      if (res == null) return null;
      return new InterfaceKitDigitalOutputCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setoutputs(InterfaceKitDigitalOutputCollection param) {
    try {
      javonetHandle.set("outputs", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public InterfaceKitAnalogSensorCollection getsensors() {
    try {
      Object res = javonetHandle.<NObject>get("sensors");
      if (res == null) return null;
      return new InterfaceKitAnalogSensorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setsensors(InterfaceKitAnalogSensorCollection param) {
    try {
      javonetHandle.set("sensors", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InterfaceKit() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Phidgets.InterfaceKit");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "InputChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InputChangeEventHandler handler : _InputChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InputChangeEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SensorChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SensorChangeEventHandler handler : _SensorChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SensorChangeEventArgs.class));
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

  public InterfaceKit(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<InputChangeEventHandler> _InputChangeListeners =
      new java.util.ArrayList<InputChangeEventHandler>();

  public void addInputChange(InputChangeEventHandler toAdd) {
    _InputChangeListeners.add(toAdd);
  }

  public void removeInputChange(InputChangeEventHandler toRemove) {
    _InputChangeListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SensorChangeEventHandler> _SensorChangeListeners =
      new java.util.ArrayList<SensorChangeEventHandler>();

  public void addSensorChange(SensorChangeEventHandler toAdd) {
    _SensorChangeListeners.add(toAdd);
  }

  public void removeSensorChange(SensorChangeEventHandler toRemove) {
    _SensorChangeListeners.remove(toRemove);
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
