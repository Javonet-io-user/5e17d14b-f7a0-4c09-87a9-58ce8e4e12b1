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

public class TemperatureSensor extends Phidget {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public TemperatureSensorAmbientSensor getambientSensor() {
    try {
      Object res = javonetHandle.<NObject>get("ambientSensor");
      if (res == null) return null;
      return new TemperatureSensorAmbientSensor((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setambientSensor(TemperatureSensorAmbientSensor param) {
    try {
      javonetHandle.set("ambientSensor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public TemperatureSensorSensorCollection getthermocouples() {
    try {
      Object res = javonetHandle.<NObject>get("thermocouples");
      if (res == null) return null;
      return new TemperatureSensorSensorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setthermocouples(TemperatureSensorSensorCollection param) {
    try {
      javonetHandle.set("thermocouples", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TemperatureSensor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Phidgets.TemperatureSensor");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "TemperatureChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (TemperatureChangeEventHandler handler : _TemperatureChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TemperatureChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TemperatureSensor(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<TemperatureChangeEventHandler> _TemperatureChangeListeners =
      new java.util.ArrayList<TemperatureChangeEventHandler>();

  public void addTemperatureChange(TemperatureChangeEventHandler toAdd) {
    _TemperatureChangeListeners.add(toAdd);
  }

  public void removeTemperatureChange(TemperatureChangeEventHandler toRemove) {
    _TemperatureChangeListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
