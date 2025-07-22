package plataforma1.wicket.semantic;

import org.apache.wicket.markup.head.*;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;
import org.wicketstuff.select2.ApplicationSettings;

import java.util.Arrays;
import java.util.List;

public class Fomantic2_9_4ResourceReference extends JavaScriptResourceReference {

    private static final Fomantic2_9_4ResourceReference instance = new Fomantic2_9_4ResourceReference();

    private Fomantic2_9_4ResourceReference() {
        super(Fomantic2_9_4ResourceReference.class, "resources2.9.4/semantic.min.js");
    }

    public static Fomantic2_9_4ResourceReference get() {
        return instance;
    }

    @Override
    public List<HeaderItem> getDependencies() {
        JavaScriptReferenceHeaderItem jquery = JavaScriptHeaderItem.forReference(JQueryResourceReference.getV3());
        CssReferenceHeaderItem style = CssHeaderItem.forReference(new CssResourceReference(Fomantic2_9_4ResourceReference.class, "resources2.9.4/semantic.min.css"));
        CssReferenceHeaderItem semanticOverrides = CssHeaderItem.forReference(new CssResourceReference(Fomantic2_9_4ResourceReference.class, "resources2.9.4/semantic-overrides.css"));
        CssReferenceHeaderItem select2Style = CssHeaderItem.forReference(new CssResourceReference(ApplicationSettings.class, "res/css/select2.css"));
        CssReferenceHeaderItem select2Overrides = CssHeaderItem.forReference(new CssResourceReference(Fomantic2_9_4ResourceReference.class, "resources2.9.4/select2-overrides.css"));
        return Arrays.asList(jquery, style, semanticOverrides, select2Style, select2Overrides);
    }

}
