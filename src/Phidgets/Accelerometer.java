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

public class Accelerometer extends Phidget {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public AccelerometerAxisCollection getaxes() {
    try {
      Object res = javonetHandle.<NObject>get("axes");
      if (res == null) return null;
      return new AccelerometerAxisCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setaxes(AccelerometerAxisCollection param) {
    try {
      javonetHandle.set("axes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Accelerometer() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Phidgets.Accelerometer");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AccelerationChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AccelerationChangeEventHandler handler : _AccelerationChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AccelerationChangeEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Accelerometer(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<AccelerationChangeEventHandler> _AccelerationChangeListeners =
      new java.util.ArrayList<AccelerationChangeEventHandler>();

  public void addAccelerationChange(AccelerationChangeEventHandler toAdd) {
    _AccelerationChangeListeners.add(toAdd);
  }

  public void removeAccelerationChange(AccelerationChangeEventHandler toRemove) {
    _AccelerationChangeListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
