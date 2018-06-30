package ua.kiev.prog.automation.framework.core.product.component.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.base.ForumPageObject;

import java.util.Iterator;
import java.util.List;

public class Search extends ForumPageObject{
    @Override
    protected Class<? extends Component> componentClass() {
        return Forum.class;
    }

    @Override
    protected By readyLocator() {
         return By.xpath("//div[@id='frame']");
    }

    final public Search getHelp(String search) {
        By searchLink = By.xpath("//table[@class='table_list']//a[@class='subject' and contains(text(), '"+search+"')]");
        WebElement s = this.driver().findElement(searchLink);
        s.click();
        return new Search();
    }

    public void findSearch () {
        WebElement inputSearch = driver().findElement(By.xpath("//div[@class='roundframe']//input[@name='search']"));
        inputSearch.sendKeys("automation");
        driver().findElement(By.xpath("//div[@class ='roundframe']//input[@name='submit']")).click();

        List<WebElement> listTitle = driver().findElements(By.xpath("//a[contains(@href, 'topic')]"));

        Iterator<WebElement> iter = listTitle.iterator();

        System.out.println("Список тем со словом Automation:");

        while (iter.hasNext()) {
            WebElement item = iter.next();
            String title = item.getText();
            System.out.println(title);
        }

    }


}
