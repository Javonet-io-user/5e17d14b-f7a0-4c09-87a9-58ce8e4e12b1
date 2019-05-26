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

public class MotorControl extends Phidget {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public MotorControlMotorCollection getmotors() {
    try {
      Object res = javonetHandle.<NObject>get("motors");
      if (res == null) return null;
      return new MotorControlMotorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setmotors(MotorControlMotorCollection param) {
    try {
      javonetHandle.set("motors", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public MotorControlDigitalInputCollection getinputs() {
    try {
      Object res = javonetHandle.<NObject>get("inputs");
      if (res == null) return null;
      return new MotorControlDigitalInputCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setinputs(MotorControlDigitalInputCollection param) {
    try {
      javonetHandle.set("inputs", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MotorControl() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Phidgets.MotorControl");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "VelocityChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MotorVelocityChangeEventHandler handler : _VelocityChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MotorVelocityChangeEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CurrentChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MotorCurrentChangeEventHandler handler : _CurrentChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MotorCurrentChangeEventArgs.class));
              }
            }
          });
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
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MotorControl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<MotorVelocityChangeEventHandler> _VelocityChangeListeners =
      new java.util.ArrayList<MotorVelocityChangeEventHandler>();

  public void addVelocityChange(MotorVelocityChangeEventHandler toAdd) {
    _VelocityChangeListeners.add(toAdd);
  }

  public void removeVelocityChange(MotorVelocityChangeEventHandler toRemove) {
    _VelocityChangeListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<MotorCurrentChangeEventHandler> _CurrentChangeListeners =
      new java.util.ArrayList<MotorCurrentChangeEventHandler>();

  public void addCurrentChange(MotorCurrentChangeEventHandler toAdd) {
    _CurrentChangeListeners.add(toAdd);
  }

  public void removeCurrentChange(MotorCurrentChangeEventHandler toRemove) {
    _CurrentChangeListeners.remove(toRemove);
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
