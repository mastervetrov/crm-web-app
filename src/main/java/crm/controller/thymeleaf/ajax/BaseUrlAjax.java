package crm.controller.thymeleaf.ajax;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for controllers.
 * Allows to specify url, which used in controllers {@link BaseAjaxController}
 *
 * @see BaseAjaxController
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface BaseUrlAjax {
  /**
   * Path to base dir.
   *
   * @return path to base dir.
   */
  String value();
}
