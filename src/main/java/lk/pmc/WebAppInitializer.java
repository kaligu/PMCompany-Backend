/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : PMCompany-Backend
  @ Date         : 9/20/2023
  @ Time         : 11:02 PM
*/
package lk.pmc;

import lk.pmc.config.WebAppConfig;
import lk.pmc.config.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/20/2023
 * Time    : 11:02 PM
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebAppRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
