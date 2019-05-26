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

public class WeightSensor extends Phidget {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public WeightSensorSensor getsensor() {
    try {
      Object res = javonetHandle.<NObject>get("sensor");
      if (res == null) return null;
      return new WeightSensorSensor((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setsensor(WeightSensorSensor param) {
    try {
      javonetHandle.set("sensor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WeightSensor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Phidgets.WeightSensor");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "WeightChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (WeightChangeEventHandler handler : _WeightChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], WeightChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WeightSensor(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<WeightChangeEventHandler> _WeightChangeListeners =
      new java.util.ArrayList<WeightChangeEventHandler>();

  public void addWeightChange(WeightChangeEventHandler toAdd) {
    _WeightChangeListeners.add(toAdd);
  }

  public void removeWeightChange(WeightChangeEventHandler toRemove) {
    _WeightChangeListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
