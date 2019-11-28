package appinventor.ai_TFicet.Pixal;

import android.os.Bundle;
import android.support.p000v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TableArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C0593runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C0605lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final IntNum Lit100;
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement2").readResolve());
    static final IntNum Lit104;
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve());
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final IntNum Lit12;
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit14;
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("Scrollable").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final FString Lit19 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement1").readResolve());
    static final IntNum Lit21;
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit23 = IntNum.make(-2);
    static final FString Lit24 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit25 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("Logo").readResolve());
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit29 = IntNum.make(50);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final FString Lit30 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Bouton_bluetooth").readResolve());
    static final IntNum Lit33;
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit36 = IntNum.make(20);
    static final IntNum Lit37 = IntNum.make(80);
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final IntNum Lit39 = IntNum.make(2);
    static final IntNum Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit43;
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit45;
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("Bouton_bluetooth$Click").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("Arrangement_tableau2").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("Arrangement_horizontal1").readResolve());
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("Column").readResolve());
    static final IntNum Lit54 = IntNum.make(0);
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Row").readResolve());
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("Bouton1").readResolve());
    static final IntNum Lit59;
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final IntNum Lit60;
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("Arrangement_horizontal2").readResolve());
    static final IntNum Lit64 = IntNum.make(1);
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("Bouton2").readResolve());
    static final IntNum Lit68;
    static final IntNum Lit69;
    static final SimpleSymbol Lit7;
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("Arrangement_horizontal3").readResolve());
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Bouton3").readResolve());
    static final IntNum Lit76;
    static final IntNum Lit77;
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final IntNum Lit81;
    static final IntNum Lit82;
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Arrangement_tableau1").readResolve());
    static final IntNum Lit86 = IntNum.make(400);
    static final FString Lit87 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit9;
    static final IntNum Lit90;
    static final IntNum Lit91;
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final IntNum Lit95;
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final IntNum Lit99;
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public HorizontalArrangement Arrangement_horizontal1;
    public HorizontalArrangement Arrangement_horizontal2;
    public HorizontalArrangement Arrangement_horizontal3;
    public TableArrangement Arrangement_tableau1;
    public TableArrangement Arrangement_tableau2;
    public BluetoothClient BluetoothClient1;
    public Button Bouton1;
    public Button Bouton2;
    public Button Bouton3;
    public Button Bouton_bluetooth;
    public final ModuleMethod Bouton_bluetooth$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalScrollArrangement HorizontalScrollArrangement1;
    public HorizontalScrollArrangement HorizontalScrollArrangement2;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Image Logo;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Screen1 screen1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Screen1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen1.lambda3();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda6();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return this.$main.Bouton_bluetooth$Click();
                case 28:
                    return Screen1.lambda10();
                case 29:
                    return Screen1.lambda11();
                case 30:
                    return Screen1.lambda12();
                case 31:
                    return Screen1.lambda13();
                case 32:
                    return Screen1.lambda14();
                case 33:
                    return Screen1.lambda15();
                case 34:
                    return Screen1.lambda16();
                case 35:
                    return Screen1.lambda17();
                case 36:
                    return Screen1.lambda18();
                case 37:
                    return Screen1.lambda19();
                case 38:
                    return Screen1.lambda20();
                case 39:
                    return Screen1.lambda21();
                case 40:
                    return Screen1.lambda22();
                case 41:
                    return Screen1.lambda23();
                case 42:
                    return Screen1.lambda24();
                case 43:
                    return Screen1.lambda25();
                case 44:
                    return Screen1.lambda26();
                case 45:
                    return Screen1.lambda27();
                case 46:
                    return Screen1.lambda28();
                case 47:
                    return Screen1.lambda29();
                case 48:
                    return Screen1.lambda30();
                case 49:
                    return Screen1.lambda31();
                case 50:
                    return Screen1.lambda32();
                case 51:
                    return Screen1.lambda33();
                case 52:
                    return Screen1.lambda34();
                case 53:
                    return Screen1.lambda35();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        int[] iArr = new int[2];
        iArr[0] = -16777216;
        Lit104 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit100 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -16777216;
        Lit99 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -16777216;
        Lit95 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit91 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -16777216;
        Lit90 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -1;
        Lit82 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -16777216;
        Lit81 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -1;
        Lit77 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -16777216;
        Lit76 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -1;
        Lit69 = IntNum.make(iArr11);
        int[] iArr12 = new int[2];
        iArr12[0] = -16777216;
        Lit68 = IntNum.make(iArr12);
        int[] iArr13 = new int[2];
        iArr13[0] = -1;
        Lit60 = IntNum.make(iArr13);
        int[] iArr14 = new int[2];
        iArr14[0] = -16777216;
        Lit59 = IntNum.make(iArr14);
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit7 = simpleSymbol;
        Lit45 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1574938370366_0.1917764247340259-0/youngandroidproject/../src/appinventor/ai_TFicet/Pixal/Screen1.yail", 266318);
        int[] iArr15 = new int[2];
        iArr15[0] = -1;
        Lit43 = IntNum.make(iArr15);
        int[] iArr16 = new int[2];
        iArr16[0] = -16777216;
        Lit33 = IntNum.make(iArr16);
        int[] iArr17 = new int[2];
        iArr17[0] = -16777216;
        Lit21 = IntNum.make(iArr17);
        int[] iArr18 = new int[2];
        iArr18[0] = -16777216;
        Lit14 = IntNum.make(iArr18);
        int[] iArr19 = new int[2];
        iArr19[0] = -16777216;
        Lit12 = IntNum.make(iArr19);
        int[] iArr20 = new int[2];
        iArr20[0] = -16777216;
        Lit9 = IntNum.make(iArr20);
        int[] iArr21 = new int[2];
        iArr21[0] = -16777216;
        Lit4 = IntNum.make(iArr21);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit109, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit110, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit111, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit112, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit113, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit114, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit115, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit116, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit117, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit118, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit119, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit120, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit121, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit122, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4782659697296625460.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, null, 0);
        this.Bouton_bluetooth$Click = new ModuleMethod(frame2, 27, Lit46, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 28, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 33, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 34, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 35, null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 39, null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 40, null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 43, null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 46, null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 47, null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 48, null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 49, null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 50, null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 51, null, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 52, null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 53, null, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Pixal", Lit7);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit9, Lit5);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "56673328.png", Lit7);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit5);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit5);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.TRUE, Lit16);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "Screen1", Lit7);
                    Values.writeValues(C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Boolean.FALSE, Lit16), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalScrollArrangement1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit19, Lit20, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit24, Lit20, lambda$Fn4);
                }
                this.Logo = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit20, Lit25, Lit26, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit20, Lit30, Lit26, lambda$Fn6);
                }
                this.Bouton_bluetooth = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit20, Lit31, Lit32, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit20, Lit44, Lit32, lambda$Fn8);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.addToCurrentFormEnvironment(Lit46, this.Bouton_bluetooth$Click);
                } else {
                    addToFormEnvironment(Lit46, this.Bouton_bluetooth$Click);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0593runtime.$Stthis$Mnform$St, "Bouton_bluetooth", "Click");
                } else {
                    addToEvents(Lit32, Lit47);
                }
                this.Arrangement_tableau2 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit48, Lit49, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit50, Lit49, lambda$Fn10);
                }
                this.Arrangement_horizontal1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit49, Lit51, Lit52, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit49, Lit56, Lit52, lambda$Fn12);
                }
                this.Bouton1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit52, Lit57, Lit58, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit52, Lit61, Lit58, lambda$Fn14);
                }
                this.Arrangement_horizontal2 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit49, Lit62, Lit63, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit49, Lit65, Lit63, lambda$Fn16);
                }
                this.Bouton2 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit63, Lit66, Lit67, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit63, Lit70, Lit67, lambda$Fn18);
                }
                this.Arrangement_horizontal3 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit49, Lit71, Lit72, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit49, Lit73, Lit72, lambda$Fn20);
                }
                this.Bouton3 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit72, Lit74, Lit75, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit72, Lit78, Lit75, lambda$Fn22);
                }
                this.Label3 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit79, Lit80, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit83, Lit80, lambda$Fn24);
                }
                this.Arrangement_tableau1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit84, Lit85, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit87, Lit85, lambda$Fn26);
                }
                this.Label1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit88, Lit89, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit0, Lit92, Lit89, lambda$Fn28);
                }
                this.HorizontalArrangement1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit93, Lit94, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit0, Lit96, Lit94, lambda$Fn30);
                }
                this.Label2 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit97, Lit98, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit0, Lit101, Lit98, lambda$Fn32);
                }
                this.HorizontalScrollArrangement2 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit102, Lit103, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit0, Lit105, Lit103, lambda$Fn34);
                }
                this.BluetoothClient1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit106, Lit107, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit108, Lit107, Boolean.FALSE);
                }
                C0593runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Pixal", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit9, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "56673328.png", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.TRUE, Lit16);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit17, "Screen1", Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Boolean.FALSE, Lit16);
    }

    static Object lambda4() {
        C0593runtime.setAndCoerceProperty$Ex(Lit20, Lit8, Lit21, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit20, Lit22, Lit23, Lit5);
    }

    static Object lambda5() {
        C0593runtime.setAndCoerceProperty$Ex(Lit20, Lit8, Lit21, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit20, Lit22, Lit23, Lit5);
    }

    static Object lambda6() {
        C0593runtime.setAndCoerceProperty$Ex(Lit26, Lit27, Lit23, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit26, Lit28, "56673328.png", Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit26, Lit22, Lit29, Lit5);
    }

    static Object lambda7() {
        C0593runtime.setAndCoerceProperty$Ex(Lit26, Lit27, Lit23, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit26, Lit28, "56673328.png", Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit26, Lit22, Lit29, Lit5);
    }

    static Object lambda8() {
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit8, Lit33, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit34, Boolean.TRUE, Lit16);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit27, Lit37, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit38, Lit39, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit40, "Bluetooth", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit41, Lit39, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit42, Lit43, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit22, Lit23, Lit5);
    }

    static Object lambda9() {
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit8, Lit33, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit34, Boolean.TRUE, Lit16);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit27, Lit37, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit38, Lit39, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit40, "Bluetooth", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit41, Lit39, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit42, Lit43, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit32, Lit22, Lit23, Lit5);
    }

    public Object Bouton_bluetooth$Click() {
        C0593runtime.setThisForm();
        return C0593runtime.callYailPrimitive(C0593runtime.open$Mnanother$Mnscreen, LList.list1("Screen2"), Lit45, "open another screen");
    }

    static Object lambda10() {
        return C0593runtime.setAndCoerceProperty$Ex(Lit49, Lit22, Lit23, Lit5);
    }

    static Object lambda11() {
        return C0593runtime.setAndCoerceProperty$Ex(Lit49, Lit22, Lit23, Lit5);
    }

    static Object lambda12() {
        C0593runtime.setAndCoerceProperty$Ex(Lit52, Lit53, Lit54, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit52, Lit55, Lit54, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit52, Lit22, Lit23, Lit5);
    }

    static Object lambda13() {
        C0593runtime.setAndCoerceProperty$Ex(Lit52, Lit53, Lit54, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit52, Lit55, Lit54, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit52, Lit22, Lit23, Lit5);
    }

    static Object lambda14() {
        C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit8, Lit59, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit40, "Batterie", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit42, Lit60, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit22, Lit23, Lit5);
    }

    static Object lambda15() {
        C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit8, Lit59, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit40, "Batterie", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit42, Lit60, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit58, Lit22, Lit23, Lit5);
    }

    static Object lambda16() {
        C0593runtime.setAndCoerceProperty$Ex(Lit63, Lit53, Lit64, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit63, Lit55, Lit54, Lit5);
    }

    static Object lambda17() {
        C0593runtime.setAndCoerceProperty$Ex(Lit63, Lit53, Lit64, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit63, Lit55, Lit54, Lit5);
    }

    static Object lambda18() {
        C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit8, Lit68, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit40, "Accélération", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit42, Lit69, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit22, Lit23, Lit5);
    }

    static Object lambda19() {
        C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit8, Lit68, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit40, "Accélération", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit42, Lit69, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit67, Lit22, Lit23, Lit5);
    }

    static Object lambda20() {
        C0593runtime.setAndCoerceProperty$Ex(Lit72, Lit53, Lit54, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit72, Lit55, Lit64, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit72, Lit22, Lit23, Lit5);
    }

    static Object lambda21() {
        C0593runtime.setAndCoerceProperty$Ex(Lit72, Lit53, Lit54, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit72, Lit55, Lit64, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit72, Lit22, Lit23, Lit5);
    }

    static Object lambda22() {
        C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit8, Lit76, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit40, "Température", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit42, Lit77, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit22, Lit23, Lit5);
    }

    static Object lambda23() {
        C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit8, Lit76, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit40, "Température", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit42, Lit77, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit75, Lit22, Lit23, Lit5);
    }

    static Object lambda24() {
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit8, Lit81, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit40, "Batterie", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit41, Lit64, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit42, Lit82, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit22, Lit23, Lit5);
    }

    static Object lambda25() {
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit8, Lit81, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit40, "Batterie", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit41, Lit64, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit42, Lit82, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit80, Lit22, Lit23, Lit5);
    }

    static Object lambda26() {
        C0593runtime.setAndCoerceProperty$Ex(Lit85, Lit27, Lit86, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit85, Lit22, Lit23, Lit5);
    }

    static Object lambda27() {
        C0593runtime.setAndCoerceProperty$Ex(Lit85, Lit27, Lit86, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit85, Lit22, Lit23, Lit5);
    }

    static Object lambda28() {
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit8, Lit90, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit40, "Accélération", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit41, Lit64, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit42, Lit91, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit22, Lit23, Lit5);
    }

    static Object lambda29() {
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit8, Lit90, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit40, "Accélération", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit41, Lit64, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit42, Lit91, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit89, Lit22, Lit23, Lit5);
    }

    static Object lambda30() {
        C0593runtime.setAndCoerceProperty$Ex(Lit94, Lit8, Lit95, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit94, Lit27, Lit86, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit94, Lit22, Lit23, Lit5);
    }

    static Object lambda31() {
        C0593runtime.setAndCoerceProperty$Ex(Lit94, Lit8, Lit95, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit94, Lit27, Lit86, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit94, Lit22, Lit23, Lit5);
    }

    static Object lambda32() {
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit8, Lit99, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit40, "Température", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit41, Lit64, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit42, Lit100, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit22, Lit23, Lit5);
    }

    static Object lambda33() {
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit8, Lit99, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit35, Lit36, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit40, "Température", Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit41, Lit64, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit42, Lit100, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit98, Lit22, Lit23, Lit5);
    }

    static Object lambda34() {
        C0593runtime.setAndCoerceProperty$Ex(Lit103, Lit8, Lit104, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit103, Lit27, Lit86, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit103, Lit22, Lit23, Lit5);
    }

    static Object lambda35() {
        C0593runtime.setAndCoerceProperty$Ex(Lit103, Lit8, Lit104, Lit5);
        C0593runtime.setAndCoerceProperty$Ex(Lit103, Lit27, Lit86, Lit5);
        return C0593runtime.setAndCoerceProperty$Ex(Lit103, Lit22, Lit23, Lit5);
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C0605lists.cons(C0605lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C0605lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C0605lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C0605lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, C0605lists.cons(componentObject, C0605lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C0605lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = C0605lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                WrongType wrongType = new WrongType(e, "arg0", -2, obj5);
                throw wrongType;
            }
        }
        try {
            LList components = C0605lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = C0605lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = C0605lists.caddr.apply1(component$Mninfo);
                C0605lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(C0605lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) C0605lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = C0605lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = C0605lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(C0605lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            Object obj7 = components;
            obj2 = obj7;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                C0605lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C0605lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = obj7;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C0605lists.caddr.apply1(component$Mninfo3);
                C0605lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            WrongType wrongType2 = new WrongType(e2, "arg0", -2, obj3);
            throw wrongType2;
        } catch (ClassCastException e3) {
            WrongType wrongType3 = new WrongType(e3, "arg0", -2, obj2);
            throw wrongType3;
        } catch (ClassCastException e4) {
            WrongType wrongType4 = new WrongType(e4, "add-to-global-var-environment", 0, var);
            throw wrongType4;
        } catch (ClassCastException e5) {
            WrongType wrongType5 = new WrongType(e5, "arg0", -2, reverse2);
            throw wrongType5;
        } catch (ClassCastException e6) {
            WrongType wrongType6 = new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
            throw wrongType6;
        } catch (ClassCastException e7) {
            WrongType wrongType7 = new WrongType(e7, "lookup-in-form-environment", 0, obj4);
            throw wrongType7;
        } catch (ClassCastException e8) {
            WrongType wrongType8 = new WrongType(e8, "arg0", -2, obj);
            throw wrongType8;
        } catch (ClassCastException e9) {
            WrongType wrongType9 = new WrongType(e9, "arg0", -2, reverse);
            throw wrongType9;
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        Object obj2 = symbols;
        while (obj2 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj2;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    obj2 = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj2);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
