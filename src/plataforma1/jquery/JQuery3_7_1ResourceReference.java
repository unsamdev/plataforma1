package plataforma1.jquery;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQuery3_7_1ResourceReference extends JavaScriptResourceReference {
    private static final long serialVersionUID = 1L;
    public static final String VERSION_1 = "jquery-3.7.1.min.js";
    private static final JQuery3_7_1ResourceReference INSTANCE = new JQuery3_7_1ResourceReference();

    public static JQuery3_7_1ResourceReference get() {
        return INSTANCE;
    }

    protected JQuery3_7_1ResourceReference() {
        super(JQuery3_7_1ResourceReference.class, VERSION_1);
    }
}
