/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customtags;

import java.io.IOException;
import java.util.Date;
import javax.servlet.jsp.JspTagException;
import static javax.servlet.jsp.tagext.Tag.EVAL_PAGE;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author alumno
 */
public class PrimeraEtiqueta extends TagSupport
{
    @Override
    public int doStartTag() throws JspTagException
    {
        return SKIP_BODY;
    }

    @Override    
    public int doEndTag() throws JspTagException
    {
        String dateString = new Date().toString();
        try
        {
            pageContext.getOut().write("Hola programador<br/>");
            pageContext.getOut().write("El nombre de mi clase es");
            pageContext.getOut().write(getClass().getName());
            pageContext.getOut().write(" y hoy es " + dateString + "<p/>");
        }catch (IOException ex)
        {
            throw new JspTagException("Excepcion " + ex.toString());
        }
        return  EVAL_PAGE;
    }
}
