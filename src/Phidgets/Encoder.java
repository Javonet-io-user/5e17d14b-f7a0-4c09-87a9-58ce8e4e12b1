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

public class Encoder extends Phidget {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public EncoderEncoderCollection getencoders() {
    try {
      Object res = javonetHandle.<NObject>get("encoders");
      if (res == null) return null;
      return new EncoderEncoderCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setencoders(EncoderEncoderCollection param) {
    try {
      javonetHandle.set("encoders", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public EncoderDigitalInputCollection getinputs() {
    try {
      Object res = javonetHandle.<NObject>get("inputs");
      if (res == null) return null;
      return new EncoderDigitalInputCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setinputs(EncoderDigitalInputCollection param) {
    try {
      javonetHandle.set("inputs", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Encoder() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Phidgets.Encoder");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PositionChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EncoderPositionChangeEventHandler handler : _PositionChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EncoderPositionChangeEventArgs.class));
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

  public Encoder(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<EncoderPositionChangeEventHandler> _PositionChangeListeners =
      new java.util.ArrayList<EncoderPositionChangeEventHandler>();

  public void addPositionChange(EncoderPositionChangeEventHandler toAdd) {
    _PositionChangeListeners.add(toAdd);
  }

  public void removePositionChange(EncoderPositionChangeEventHandler toRemove) {
    _PositionChangeListeners.remove(toRemove);
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
