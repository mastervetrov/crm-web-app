package crm.controller.thymeleaf.html;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for controllers.
 * Allows to specify url, which used in controllers {@link BaseHtmlController}
 *
 * @see BaseHtmlController
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface BaseUrl {
  /**
   * Path to target dir.
   *
   * @return path to target dir.
   */
  String value();
}