package Next.NextPageSteps;

import Next.Pages.BasePage;
import Next.Pages.SearchPage;
import io.cucumber.java.en.Then;

public class SearchPageSteps {
    SearchPage searchPage = new SearchPage();

    @Then("^I should navigate to dress page$")
    public void navigateToDressesPage(){
        searchPage.isSearchedItemShownOnPage();
    }
}
