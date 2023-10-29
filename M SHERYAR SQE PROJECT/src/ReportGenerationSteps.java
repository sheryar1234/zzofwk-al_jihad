import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ReportGenerationSteps {

    private boolean userLoggedIn = false;
    private boolean reportPageLoaded = false;
    private String selectedFormat = "";
    private String selectedStartDate = "";
    private String selectedEndDate = "";
    private String selectedParameter1 = "";
    private String selectedParameter2 = "";
    private boolean reportGenerated = false;
    private boolean previewDisplayed = false;

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        userLoggedIn = true;
        System.out.println("User logged in successfully.");
    }

    @When("the user navigates to the report generation section")
    public void theUserNavigatesToReportGenerationSection() {
        reportPageLoaded = true;
        System.out.println("User navigated to the report generation section.");
    }

    @Then("the report generation page should be accessible")
    public void theReportGenerationPageShouldBeAccessible() {
        Assert.assertTrue(reportPageLoaded);
        System.out.println("Report generation page is accessible.");
    }

    @When("the user chooses the desired report format as {string}")
    public void theUserChoosesTheDesiredReportFormat(String format) {
        selectedFormat = format;
        System.out.println("Desired report format selected: " + format);
    }

    @Then("the selected format should be highlighted")
    public void theSelectedFormatShouldBeHighlighted() {
        Assert.assertEquals("PDF", selectedFormat);
        System.out.println("Selected format is highlighted.");
    }

    @When("the user selects the date range from {string} to {string}")
    public void theUserSelectsTheDateRange(String startDate, String endDate) {
        selectedStartDate = startDate;
        selectedEndDate = endDate;
        System.out.println("Date range selected: " + startDate + " to " + endDate);
    }

    @Then("the selected date range should be displayed")
    public void theSelectedDateRangeShouldBeDisplayed() {
        Assert.assertEquals("2023-01-01", selectedStartDate);
        Assert.assertEquals("2023-12-31", selectedEndDate);
        System.out.println("Selected date range is displayed.");
    }

    @When("the user applies filters for specific data parameters like {string} and {string}")
    public void theUserAppliesFilters(String parameter1, String parameter2) {
        selectedParameter1 = parameter1;
        selectedParameter2 = parameter2;
        System.out.println("Filters applied: " + parameter1 + ", " + parameter2);
    }

    @Then("the data should be filtered based on the selected parameters")
    public void theDataShouldBeFilteredBasedOnTheSelectedParameters() {
        Assert.assertEquals("Sales", selectedParameter1);
        Assert.assertEquals("Region: North", selectedParameter2);
        System.out.println("Data is filtered based on the selected parameters.");
    }

    @When("the user clicks on the 'Generate Report' button")
    public void theUserClicksOnGenerateReportButton() {
        reportGenerated = true;
        System.out.println("Report generation button clicked.");
    }

    @Then("the report generation process should be initiated")
    public void theReportGenerationProcessShouldBeInitiated() {
        Assert.assertTrue(reportGenerated);
        System.out.println("Report generation process initiated.");
    }

    @When("the user views the preview of the generated report")
    public void theUserViewsThePreviewOfTheGeneratedReport() {
        previewDisplayed = true;
        System.out.println("Preview of the generated report displayed.");
    }

    @Then("the preview should display the report accurately")
    public void thePreviewShouldDisplayTheReportAccurately() {
        Assert.assertTrue(previewDisplayed);
        System.out.println("Preview displays the report accurately.");
    }
}
