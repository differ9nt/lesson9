package ua.kiev.prog.automation.framework.core.product.component.object;

import org.openqa.selenium.By;


/**
 * ////////////////////////////////////////////////////////// *
 * Automation Framework                                       *
 * Automation Course for https://prog.kiev.ua/                *
 * ---------------------------------------------------------- *
 * Created by Yurii Voronenko                                 *
 * Email: yurii.voronenko@gmail.com                           *
 * ////////////////////////////////////////////////////////// *
 */
 abstract public class BlockObject extends PageObject
{

    private WidgetObject _search    = new WidgetObject(this.driver(), By.xpath("//div[@id='main_menu']//li[@id='button_search']"));

    public Search getSearch ()
    {
        _search.click();
        // TODO return
        return new Search();
    }



}
