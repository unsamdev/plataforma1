package plataforma1.wicket.semantic;

import com.vaynberg.wicket.select2.ApplicationSettings;
import org.apache.wicket.markup.head.*;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

import java.util.Arrays;

/**

 */
public class Semantic2_3_1ResourceReference extends JavaScriptResourceReference {

    private static final Semantic2_3_1ResourceReference instance = new Semantic2_3_1ResourceReference();

    private Semantic2_3_1ResourceReference() {
        super(SemanticResourceReference.class, "resources2.3.1/semantic.min.js");
    }

    public static Semantic2_3_1ResourceReference get() {
        return instance;
    }

    @Override
    public Iterable<? extends HeaderItem> getDependencies() {
        JavaScriptReferenceHeaderItem jquery = JavaScriptHeaderItem.forReference(JQueryResourceReference.get());
        CssReferenceHeaderItem style = CssHeaderItem.forReference(new CssResourceReference(Semantic2_3_1ResourceReference.class, "resources2.3.1/semantic.min.css"));
        CssReferenceHeaderItem semanticOverrides = CssHeaderItem.forReference(new CssResourceReference(Semantic2_3_1ResourceReference.class, "resources2.3.1/semantic-overrides.css"));
        CssReferenceHeaderItem select2Style = CssHeaderItem.forReference(new CssResourceReference(ApplicationSettings.class, "res/select2.css"));
        CssReferenceHeaderItem select2Overrides = CssHeaderItem.forReference(new CssResourceReference(Semantic2_3_1ResourceReference.class, "resources2.3.1/select2-overrides.css"));
        return Arrays.asList(jquery, style, semanticOverrides, select2Style, select2Overrides);
    }

}
