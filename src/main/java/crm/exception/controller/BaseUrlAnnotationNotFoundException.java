package crm.exception.controller;

/**
* Exception occurs, if controller thymeleaf without {@link crm.controller.thymeleaf.html.BaseUrl}.
*/
public class BaseUrlAnnotationNotFoundException extends IllegalArgumentException {
  /**
  * Error message.
  *
  * @param s text error message
  */
  public BaseUrlAnnotationNotFoundException(String s) {
    super(s);
  }
}
