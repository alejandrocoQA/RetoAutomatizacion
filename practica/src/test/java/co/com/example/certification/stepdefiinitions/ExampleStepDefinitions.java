package co.com.example.certification.stepdefiinitions;

import co.com.amazon.certification.exampleproject.tasks.OpenUp;
import co.com.amazon.certification.exampleproject.tasks.SelectionObject;
import co.com.amazon.certification.exampleproject.tasks.VerificationObject;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ExampleStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro navegando por la pagina de Amazon para encontrar productos$")
    public void queMeEncuentroNavegandoPorLaPaginaDeAmazonParaEncontrarProductos() throws Exception {
        OnStage.theActorCalled("actor").wasAbleTo(OpenUp.thePage());

    }

    @When("^encuentro dos productos los selecciono y los agrego al carro de compras$")
    public void encuentroDosProductosLosSeleccionoYLosAgregoAlCarroDeCompras() throws Exception {
        OnStage.theActorCalled("actor").wasAbleTo(SelectionObject.thePage());

    }

    @Then("^debo validar en el carro de compras que los productos se encuentran agregados$")
    public void deboValidarEnElCarroDeComprasQueLosProductosSeEncuentranAgregados() throws Exception {
        OnStage.theActorCalled("actor").wasAbleTo(VerificationObject.thePage());

    }
}
