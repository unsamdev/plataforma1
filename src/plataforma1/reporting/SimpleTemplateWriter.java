package plataforma1.reporting;

import freemarker.template.Configuration;
import freemarker.template.SimpleHash;
import freemarker.template.Template;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

/**
 * <p>Utilidad genérica para generar archivos html a partir de plantillas Freemarker</p>
 */
public class SimpleTemplateWriter {

    private static final Logger logger = Logger.getLogger(SimpleTemplateWriter.class.getName());

    /**
     * Genera html utilizando como salida outputStream.
     *
     * @param data                    POJO que se utiliza como base de navegación de grafo en la plantilla, referenciado en la misma como "data"
     * @param classForTemplateLoading clase a partir de cuyo classloader se cargan los archivos de plantilla
     * @param templateSpec            especificación del archivo de plantilla
     * @param outputStream            salida del archivo HTML
     * @throws Exception
     */
    public void writeDocument(Object data, Class<?> classForTemplateLoading, String templateSpec, OutputStream outputStream) throws Exception {
        Template template = createConfiguration(classForTemplateLoading).getTemplate(templateSpec);
        SimpleHash rootModel = new SimpleHash();
        rootModel.put("data", data);

        try (OutputStreamWriter writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)) {
            template.process(rootModel, writer);
        }
    }

    private Configuration createConfiguration(Class<?> classForTemplateLoading) throws IOException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        configuration.setClassForTemplateLoading(classForTemplateLoading, "");
        return configuration;
    }
}
